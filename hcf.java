class hcf{
    static int hcf (int a,int b){
        if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else if(a==b){
            return a;
        }
        else if (a>b){
            return hcf(a-b,b);
        }
        else{
            return hcf(a,b-a);
        }


    }
    public static void main(String args[]){
        int a=23;
        int b=69;
        System.out.println(hcf(a,b));
    }
}