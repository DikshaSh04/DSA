package ArrayAndString.TwoPointer;
//Q:
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(heights));

    }

    //CORE LOGIC: We have to find the maximum area of rectangle between two lines,
    //we compute the area of the farthest lines first then record the area, and then
    //move the pointer with the smaller line so as to find a taller line, even if not
    //found we already record every area and save it if it is greater than the previous
    //areas.

    public static int mostWater(int[] heights){
        int start = 0;
        int end = heights.length-1;
        int maxArea = 0;

        while(start<end){
            int area;
            if(heights[start] > heights[end]){
                area = (end - start) * heights[end];
                end--;
            }
            else{
                area = (end - start) * heights[start];
                start++;
            }
            if(area>maxArea){
                maxArea = area;
            }

        }
        return maxArea;

    }


}
