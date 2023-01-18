import tester.*;

class DesignRecipeExamples {
    int perimeter(int width, int height){   // method header: int type, method's name is perimeter and takes in two integers as the parameters (width and length) 
        return (2 * width) + (2 * height);  // method body: multiples both width and length by 2, adds the products and then returns the sum 
    }
    int testingPerimter1 = perimeter(5,5);  // Expected : 20 . Calls the Perimeter method and stores return value a field variable
    int testingPerimter2 = perimeter(3,8);  // Expected: 22 . Calls the Perimeter method and stores return value in a field variable

    int borderArea(int width, int height, int cutWidth, int cutHeight){ // Method Header : four parameters of integer types
        int areaRectangle = width * height;
        int cut = cutWidth * cutHeight;
        int areaOfBorder = areaRectangle - cut;
        return areaOfBorder;    // Method Body: The area of the region between the two shapes
    }
    int testingBorderArea1 = borderArea(5, 5, 2, 2); // Expected: 21 . Calls the borderArea method and stores a value in a field variable
    int testingBorderArea2 = borderArea(7, 7, 5, 5); // Expected: 24 . Calle the borderArea method and stores a value in a field variable

    int megaByteConverter(int gigaByte){    // Method header: Gigabyte to Megabyte converter. Takes in an integer that is a gigabyte and converts it into an integer representing the total amount of megabytes in that argument. 
        int megaBytes = gigaByte * 1000;
        return megaBytes;   // Method Body: multiplies the argument by 1000 to get number of megaBytes
    }

    // The difference between this method and a reference converter is that a reference converter is able to pass in AND return numbers less than 1 (ex. .01, -5).
    // The limitation of my header is that it can only pass in and return integers and not doubles.

    int testingGigaByteConverter1 = megaByteConverter(3); // Expected 3000. Calls the megaByteConverter method and stores a value in a field variable
    int testingGigaByteConverter2 = megaByteConverter(17); // Expected 17000. Calls the megaByteConverter method and stores a value in a field variable

    int dollarsAndCents(int dollars, int cents){    // Method Header: Combines dollars and cents (int types) and returns total number of cents (int type)
        int centsInADollar = dollars * 100; 
        int totalCents = centsInADollar + cents;
        return totalCents;  // Method Body: adds total number of cents after converting dollars to cents
    }

    // The pair (999999999, 999999999) yields a negative integer although it should produce a positive integer. This must be because the sum in this case is bigger than 2,147,483,647, which is the greatest number an integer can be. 
    // At that point, the sum is not an integer, but the type of the return statement must be an integer.

    int testingdollarsAndCents1 = dollarsAndCents(999999999, 999999999);   // Expected: 576
    int testingdollarsAndCents2 = dollarsAndCents(362, 39); // Expected: 36239
}
