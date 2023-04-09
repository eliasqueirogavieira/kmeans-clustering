# KMeans Clustering Implementation in Java

This project is an implementation of the KMeans clustering algorithm in Java. The project consists of five main files, each with a specific role in the implementation and demonstration of the algorithm:

## 1. Statistics.java

`Statistics.java` is a utility class that provides methods to perform common statistical operations on a list of numbers. These operations include:

- **Mean**: Calculates the average value of a list of numbers.
- **Median**: Finds the middle value in a sorted list of numbers.
- **Standard Deviation**: Measures the dispersion of a set of data points from their mean.
- **Z-score Normalization**: Standardizes the data points in a dataset by subtracting the mean and dividing by the standard deviation.

These methods are useful for pre-processing the data before using it with the KMeans clustering algorithm.

## 2. DataPoint.java

`DataPoint.java` is a class that represents a data point in a multi-dimensional space. It provides the following methods and functionality:

- **Constructor**: Takes a list of dimensions (double values) as input and creates a data point.
- **getDimension**: Accesses the dimensions of a data point.
- **euclideanDistance**: Computes the Euclidean distance between two data points in multi-dimensional space.

The `DataPoint` class is used as the base class for custom data point types in the examples provided.

## 3. KMeans.java

`KMeans.java` is the main class that implements the KMeans clustering algorithm. It offers the following methods and functionality:

- **Constructor**: Takes the desired number of clusters (k) and a list of data points as input.
- **assignToClusters**: Assigns data points to the nearest centroid of the clusters.
- **generateCentroids**: Computes the new centroids for the clusters based on the mean of the data points within each cluster.
- **converged**: Checks if the clustering process has converged, i.e., if the centroids have stopped changing.
- **run**: Executes the KMeans clustering algorithm for a specified number of iterations or until convergence is reached.

This class is used with the custom data point types in the examples provided to perform KMeans clustering on the datasets.

## 4. Governor.java

`Governor.java` is an example class that extends the `DataPoint` class. It represents a governor of a state in the United States, with the following attributes:

- **Longitude**: The longitude of the state capital.
- **Age**: The age of the governor.
- **State**: The name of the state.

The `Governor` class includes a `toString` method to represent the data in a human-readable format. The `main` method demonstrates how to use the KMeans clustering algorithm on a list of governors by initializing the dataset, running the KMeans algorithm, and printing the resulting clusters.

## 5. Album.java

`Album.java` is another example class that extends the `DataPoint` class. It represents a music album, with the following attributes:

- **Name**: The name of the album.
- **Year**: The release year of the album.
- **Length**: The total length of the album in minutes.
- **Tracks**: The number of tracks on the album.

The `Album` class also includes a `toString` method to represent the data in a human-readable format. The `main` method demonstrates how to use the KMeans clustering algorithm on a list of albums by initializing the dataset, running the KMeans algorithm, and printing the resulting clusters along with the average length and number of tracks for each cluster.

