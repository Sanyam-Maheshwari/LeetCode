class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int aa=(ax2-ax1)*(ay2-ay1);
        int ba=(bx2-bx1)*(by2-by1);
        
        
        int left=Math.max(ax1,bx1);
        int bottom=Math.max(ay1,by1);
        int right=Math.min(ax2,bx2);
        int top=Math.min(ay2,by2);
        
        int ca=0;
        int xOverlap=right-left;
        int yOverlap=top-bottom;
        if(xOverlap>0 && yOverlap>0)
            ca=xOverlap * yOverlap;
        return aa+ba-ca;
    }
}