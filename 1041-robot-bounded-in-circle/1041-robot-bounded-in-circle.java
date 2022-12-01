class Solution {
    public boolean isRobotBounded(String inst) {
        int x=0;
        int y=0;
        char face='n';
        for(int i=0;i<inst.length();i++)
        {
            if(inst.charAt(i)=='G')
            {
                if(face=='n')
                {
                    y+=1;
                }
                else if(face=='w')
                {
                    x-=1;
                }
                else if(face=='s')
                {
                    y-=1;
                }
                else if(face=='e')
                {
                    x+=1;
                }
            }
            else if(inst.charAt(i)=='L')
            {
                if(face=='n')
                {
                    face='w';
                }
                else if(face=='w')
                {
                    face='s';
                }
                else if(face=='s')
                {
                    face='e';
                }
                else if(face=='e')
                {
                    face='n';
                }
            }
            else
            {
                if(face=='n')
                {
                    face='e';
                }
                else if(face=='w')
                {
                    face='n';
                }
                else if(face=='s')
                {
                    face='w';
                }
                else if(face=='e')
                {
                    face='s';
                }
            }
            // System.out.println(face);
        }
         if(x==0 && y==0 || face!='n')
             return true;
        // if(face=='n'){
        //     System.out.println("oyoy");
        //     return false;
        // }
        return false;
    }
}