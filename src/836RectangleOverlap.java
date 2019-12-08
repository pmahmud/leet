class Rect {
    int x1;
    int y1;
    int x2;
    int y2;  
    Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;
    }
}

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        Rect rect1 = new Rect(rec1[0], rec1[1], rec1[2], rec1[3]);
        Rect rect2 = new Rect(rec2[0], rec2[1], rec2[2], rec2[3]);
        
        return !(rect1.x2 <= rect2.x1 // left
                || rect1.x1 >= rect2.x2 //right
                || rect1.y2 <= rect2.y1 // bottom
                || rect1.y1 >= rect2.y2); // top        
    }
}
