class Solution {

    // Method to find the maximum distance between any pair of elements 
    // from different arrays within the list of arrays.
    public int maxDistance(List<List<Integer>> arrays) {
        // Initializing 'ans' as 0 to hold the maximum distance encountered.
        int maxDistance = 0;

        // Assign the first element of the first array as the minimum known value 'min'.
        int min = arrays.get(0).get(0);

        // Assign the last element of the first array as the maximum known value 'max'.
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
      
        // Iterate over the remaining arrays in the list starting from the second array.
        for (int i = 1; i < arrays.size(); ++i) {
            List<Integer> array = arrays.get(i);

            // Calculate the absolute difference between the first element of the current array 
            // and the known maximum. This represents a potential max distance.
            int distanceWithMax = Math.abs(array.get(0) - max);

            // Calculate the absolute difference between the last element of the current array 
            // and the known minimum. This represents a potential max distance.
            int distanceWithMin = Math.abs(array.get(array.size() - 1) - min);

            // Update 'maxDistance' with the greater of the two newly calculated distances 
            // if either is larger than the current 'maxDistance'.
            maxDistance = Math.max(maxDistance, Math.max(distanceWithMax, distanceWithMin));

            // Update the known minimum value 'min' if the first item of the current array is smaller.
            min = Math.min(min, array.get(0));

            // Update the known maximum value 'max' if the last item of the current array is larger.
            max = Math.max(max, array.get(array.size() - 1));
        }

        // Return the largest distance found.
        return maxDistance;
    }
}
