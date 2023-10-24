package Assigment3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Functions {

    public String[] getMovieInfoByID(String filePath, int movieId) { // Returns the title and genres of the movie by the given movie ID
        String[] movieInfo = new String[2];
        boolean firstLine = true;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream(filePath))))) { // Use BufferedReader to read the file
            String line;

            while ((line = br.readLine()) != null) { // Read the file line by line
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);

                if (id == (movieId + 1)) {
                    movieInfo[0] = values[1];  // Başlık (title)
                    movieInfo[1] = values[2];  // Türler (genres)
                    break;
                } else {
                    movieInfo[0] = "Movie not found"; // If the movie is not found, Return this message
                    movieInfo[1] = " "; // If the movie is not found, Return this message
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return movieInfo;
    }

    public List<Integer> findMaxIndices(int[] vector, int x) { // Returns the indices of the maximum values in the vector
        List<Integer> maxIndices = new ArrayList<>(); // Create a list to hold the indices of the maximum values

        if (x <= 0 || vector.length == 0)
            return maxIndices;
            // If the number of maximum values to be found is less than or equal to 0 or the vector is empty, Return an empty list

        int[] tempVector = vector.clone(); // Create a temporary copy so as not to change the original vector

        for (int i = 0; i < x; i++) {
            int maxIndex = 0;
            int maxValue = tempVector[0];

            for (int j = 1; j < tempVector.length; j++) {
                if (tempVector[j] > maxValue) {
                    maxValue = tempVector[j];
                    maxIndex = j;
                }
            }
            maxIndices.add(maxIndex); // Add the index of the maximum value found to the list
            tempVector[maxIndex] = Integer.MIN_VALUE; // Assign the minimum value to the maximum value found so that it is not found again
        }
        return maxIndices;
    }

    public int getIndexofMax(double[] cosinesimilarity, MaxHeap m) { // Returns the index of the maximum value in the cosinesimilarity array
        double max = (double) m.getMax();

        for (int i = 0; i < cosinesimilarity.length; i++) {
            if (cosinesimilarity[i] == max) {
                m.deleteMax();
                return i;
            }
        }
        return -1;
    }

    public double[] cosineSimilarity(int[] vector1, List<int[]> vectors, MaxHeap m) {
        // Returns the cosine similarity values of the given vector with all vectors in the list
        double[] cosinesimilarity = new double[vectors.size()];

        // Find the cosine similarity values of the given vector with all vectors in the list
        for (int i = 0; i < vectors.size(); i++) {
            cosinesimilarity[i] = cosineSimilarity(vector1, vectors.get(i));
            m.insert(cosinesimilarity[i]);
        }
        return cosinesimilarity;
    }

    public List<int[]> readCSV(String filePath) { // Returns the vectors in the csv file as a list
        List<int[]> vectors = new ArrayList<>(); // Create a list to hold the vectors

        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream(filePath))))) { // Use BufferedReader to read the file
            String line;
            boolean firstLine = true;

            while ((line = bufferedReader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;  // İlk satırı atla
                }
                String[] values = line.split(",");
                int[] vector = new int[values.length - 1];
                // Reduce the size by one because the first column contains the user ID number

                for (int i = 1; i < values.length; i++) {
                    vector[i - 1] = Integer.parseInt(values[i]);
                }
                vectors.add(vector); // Add the vector to the list
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return vectors;
    }

    // Returns the cosine similarity value of the given two vectors as a double value between 0 and 1
    public double cosineSimilarity(int[] vector1, int[] vector2) {
        double dotProduct = 0.0;
        double norm1 = 0.0;
        double norm2 = 0.0;

        for (int i = 0; i < vector1.length; i++) {
            dotProduct += vector1[i] * vector2[i];
            norm1 += Math.pow(vector1[i], 2);
            norm2 += Math.pow(vector2[i], 2);
        }
        return dotProduct / (Math.sqrt(norm1) * Math.sqrt(norm2));
    }

    public int getMovieIDbyCombobox(int x) { //Returns the IDs of the movies based on the movie selected from the Combobox
        switch (x) {
            case 0:
                return 0;
            case 1:
                return 2875;
            case 2:
                return 8512;
            case 3:
                return 7122;
            case 4:
                return 1214;
            case 5:
                return 3535;
            case 6:
                return 8363;
            case 7:
                return 2974;
            case 8:
                return 5988;
            case 9:
                return 6157;
            case 10:
                return 6514;
            case 11:
                return 2985;
        }
        return 0;
    }
}