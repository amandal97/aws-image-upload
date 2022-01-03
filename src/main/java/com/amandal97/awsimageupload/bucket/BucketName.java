package com.amandal97.awsimageupload.bucket;

public enum BucketName {
	
	PROFILE_IMAGE("amandal97-image-upload");
	
	private final String bucketName;
	
	BucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketName() {
		return bucketName;
	}
	
}
