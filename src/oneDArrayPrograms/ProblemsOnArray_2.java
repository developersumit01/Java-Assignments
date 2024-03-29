package oneDArrayPrograms;

//	This is the URL of that google drive from which you can take the reference if this assignment.
//	https://drive.google.com/file/d/1wcUGE13lkqexSQudyZj-IH45we2RjBSY/view?usp=drive_link
	
public class ProblemsOnArray_2 {	
//	Que 1. Given an array arr[] of size n, find the first repeating element. The element should occur
//	more thanonce and the index of its first occurrence should be the smallest. If no repeating element 	
//	exists, print -1.
//	(Assume 1 based indexing)
	
	public int repeatingElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return i+1;
				}
			}
		}
		return -1;
	}
	
//	Que 2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
//	every positive number is followed by a negative and vice-versa maintaining the order of appearance.
//	The number of positive and negative numbers need not be equal. Begin with a negative number.
//	If there are more positive numbers, they appear at the end of the array. If there are more negative
//	numbers, they too appear at the end of the array.
	
	public int[] arrangeArray(int arr[]) {
		int pos=0,neg=0;
		int index=0;
		int ans[]=new int[arr.length];
		while(index<arr.length) {
			while(arr[neg]>0&&neg<arr.length-1) {
				neg++;
			}
			if(arr[neg]<0)
			ans[index++]=arr[neg++];
			while(arr[pos]<-1&&pos<arr.length-1) {
				pos++;
			}
			if(arr[pos]>-1)
			ans[index++]=arr[pos++];
		}
		return ans;
	}
	
//	Que 3. Minimum Platforms
//	Given arrival and departure times of all trains that reach a railway station. Find the minimum number
//	of platforms required for the railway station so that no train is kept waiting.
//	Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure
//	time can never be the same for a train but we can have arrival time of one train equal to departure time
//	of the other. At any given instance of time, same platform can not be used for both departure of a train
//	and arrival of another train. In such cases, we need different platforms.
//	Input 1:
//		n = 6
//		arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
//		dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
//	Output 1:
//		3
	
	public int minimumPlatform(int arr[],int dep[]) {
		if(arr.length!=dep.length) {
			System.out.println("The number of arrivel time is not equels to number of departure time");
			System.out.println("so that the given data is wrong.");
			return -1;
		}
		int numberOfPlatform=0;
		int temp[]=new int[2461];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]++;
			temp[dep[i]]--;
		}
		for(int i=1;i<temp.length;i++) {
			temp[i]+=temp[i-1];
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>numberOfPlatform) {
				numberOfPlatform=temp[i];
			}
		}
		return numberOfPlatform;
	}
	
}
