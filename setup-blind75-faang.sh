#!/bin/bash

echo "🔧 Patching Solution class names to match filenames..."

BASE="src/main/java/com/tushar/blind75"

# Find all Java files
find "$BASE" -name "*.java" | while read FILE
do

    FILENAME=$(basename "$FILE" .java)

    # Check if file contains 'class Solution'
    if grep -q "class Solution" "$FILE"; then

        echo "Updating $FILE → class $FILENAME"

        # Replace class Solution with public class Filename
        sed -i '' "s/class Solution/public class $FILENAME/g" "$FILE"

        # Replace Solution constructor usage
        sed -i '' "s/Solution sol = new Solution()/$FILENAME sol = new $FILENAME()/g" "$FILE"

    else
        echo "Skipping $FILE (already updated)"
    fi

done

echo ""
echo "✅ Patch complete!"
echo "All Solution classes now match filenames."