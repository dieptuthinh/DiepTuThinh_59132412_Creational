public class MyStringBuilder {
    String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }
    
    public MyStringBuilder addString(String s) {
        str += s ;
        return this;
    }
    
    public MyStringBuilder addFloat(float f) {
        str += f ;
        return this;
    }
    
    public MyStringBuilder addBool(boolean b) {
        str += b ;
        return this;
    }
    
   public MyStringBuilder build() {
       return this;
   }

    @Override
    public String toString() {
        return str;
    }
}
