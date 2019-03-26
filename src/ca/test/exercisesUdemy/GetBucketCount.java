package ca.test.exercisesUdemy;

public class GetBucketCount {
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
        	return -1;
        if(extraBuckets < 0)
        	return -1;
        
        double buckets = (width * height) / areaPerBucket;
        int result = (int)Math.ceil(buckets - extraBuckets);
        
        return result;
    }
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if(width <= 0 || height <= 0 || areaPerBucket <= 0)
        	return -1;
        
        double buckets = (width * height) / areaPerBucket;
        int result = (int)Math.ceil(buckets);
        
        return result;
    }
	
	public static int getBucketCount(double area, double areaPerBucket) {
		if(area <= 0 || areaPerBucket <= 0)
        	return -1;
        
        int buckets = (int)Math.ceil(area / areaPerBucket);
        
        return buckets;
    }
}
