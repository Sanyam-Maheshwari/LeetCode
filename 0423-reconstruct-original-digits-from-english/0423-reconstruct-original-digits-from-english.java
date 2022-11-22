class Solution {
    public String originalDigits(String s) {
        int [] nums=new int[10];
        int []count=new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }
        
        nums[0]=count['z'-'a'];
        nums[2]=count['w'-'a'];
        nums[4]=count['u'-'a'];
        nums[6]=count['x'-'a'];
        nums[8]=count['g'-'a'];
        
        nums[1]=count['o'-'a']-nums[0]-nums[2]-nums[4];
        nums[3]=count['h'-'a']-nums[8];
        nums[5]=count['f'-'a']-nums[4];
        nums[7]=count['s'-'a']-nums[6];
        nums[9]=count['i'-'a']-nums[6]-nums[5]-nums[8];
        
        String ans="";
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]-->0)
                ans=ans+i;
        }
        return ans;
    }
}