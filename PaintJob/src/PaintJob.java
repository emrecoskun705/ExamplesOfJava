public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) return -1;

        double wallArea = width * height;
        double singleBucket = wallArea / areaPerBucket;

        int newSingleBucket = (int) (Math.ceil(singleBucket));


        return (newSingleBucket - extraBuckets );
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) return -1;
        double wallArea = width * height;
        double singleBucket = wallArea / areaPerBucket;
        int newSingleBucket = (int) (Math.ceil(singleBucket));

        return (newSingleBucket);
    }

    public static int getBucketCount(double wallArea, double areaPerBucket) {
        if((wallArea <= 0) || (areaPerBucket <= 0)) return -1;
        double singleBucket = wallArea / areaPerBucket;
        int newSingleBucket = (int) (Math.ceil(singleBucket));

        return (newSingleBucket);

    }
}
