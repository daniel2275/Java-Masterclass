package com.danielradonic;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double totalSurface = width * height;

        double totalBuckets = totalSurface / areaPerBucket;

        if (totalBuckets > extraBuckets) {
            return (int) (Math.ceil(totalBuckets - extraBuckets));
        } else {
            return 0;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalSurface = width * height;

        double totalBuckets = totalSurface / areaPerBucket;

        if (totalBuckets > 0) {
            return (int) (Math.ceil(totalBuckets));
        } else {
            return 0;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalBuckets = area / areaPerBucket;

        if (totalBuckets > 0) {
            return (int) (Math.ceil(totalBuckets));
        } else {
            return 0;
        }
    }
}
