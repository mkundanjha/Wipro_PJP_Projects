public class Box{
    int width;
    int height;
    int depth;
    Box(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    
    public int getVolume(){
        return width*height*depth;
    }
}

