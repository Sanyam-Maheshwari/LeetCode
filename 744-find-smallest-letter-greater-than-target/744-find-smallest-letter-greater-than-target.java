// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int l=0;
//         int r=letters.length-1;
//         int mid=0;
//         while(l<=r)
//         {
//             mid=l+(r-l)/2;
//             if(letters[mid]==target)
//             {
//                 if(mid==letters.length-1)
//                     return letters[0];
//                 else
//                     return letters[mid+1];
//             }
                
//             else if(letters[mid]>target)
//                 r=mid-1;
//             else
//                 l=mid+1;
//         }
//         // return letters[0];
//             if(letters[mid]>target)
//                 return letters[mid];
//             else
//                 if(mid==letters.length-1)
//                     return letters[0];
//                 else
//                     return letters[mid+1];
//     }
// }

class Solution {
public char nextGreatestLetter(char[] letters, char target) {
//just using simple binary search approach

    int start=0,end=letters.length-1,mid=0;
    char ans =letters[0];
    
    if(target>letters[end]) return letters[0]; //if the letters wrap around then just return the first element
    
    while(start<=end){
	
        mid =start + (end-start)/2;
        
        if(target<letters[mid]){
            end=mid-1;
            
        }else if(target>letters[mid]){
            start=mid+1; //we want the smallest letter thats why we want to keep the loop running
            ans =letters[start]; //and we want to save this in ans so that whenever the loop is over we can return it
            
        }else{
		
            if(mid+1<letters.length){
			
               start=mid+1; //if we find our target still we want keep looking in case of multiple targets
            ans= letters[mid+1]; //after we find our target we want to store the next element into ans
                
            }else return letters[0]; //if target is at the end then we want to return the first element
        }
    }
return ans;
}
}