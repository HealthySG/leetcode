class Solution {
    public int maximumSwap(int num) {
           /* String temp = Integer.toString(num);
            List<Pair> numArr = new ArrayList<>();
            for (int i = 0; i < temp.length(); i++)
            {
                Pair p=new Pair(temp.charAt(i)-'0',i);
                numArr.add(p);
            }
            List<Pair> originalArr = new ArrayList<>(numArr);
            Collections.sort(numArr,new Comparator<Pair>(){
                    @Override
                    public int compare(Pair h1, Pair h2) {
                        return (h2.ele)-(h1.ele);
                    }
                });
          for(int i=0;i<originalArr.size();i++)
          {
              if(numArr.get(i).ele != originalArr.get(i).ele)
              {
                  int changeToElem=numArr.get(i).ele;
                  int originalElem=originalArr.get(i).ele;
                  
                  int changeToIndex=numArr.get(i).i;
                  int originalIndex=originalArr.get(i).i;
                   if(originalArr.lastIndexOf(changeToElem)>changeToIndex)
                  {
                   
                 originalArr.get(i).ele=changeToElem;
                 originalArr.get((originalArr.lastIndexOf(changeToElem))).ele=originalElem;
                 break;
                  }
                  else
                 {
                      originalArr.get(i).ele=changeToElem;
                     originalArr.get(changeToIndex).ele=originalElem;
                  break;
                }
              }
          }
        String ans="";
        for(int i=0;i<originalArr.size();i++)
        {
            ans=ans+originalArr.get(i).ele;
        }
           return Integer.parseInt(ans);
        }
        */
         int numC = num;
        
        int min = Integer.MAX_VALUE;
        int minI = -1;
        
        int max = Integer.MIN_VALUE;
        int maxI = -1;
        
        int pre = -1;
        int i = 0;
        
        int lmax = Integer.MIN_VALUE;
        int lmaxI = -1;
        
        //find out min and max values and their index in the num
        while(num != 0){
            int cur = num % 10;
            num = num / 10;
            
            //record increase in max value locally
            if(cur > lmax){
                lmax = cur;
                lmaxI = i +1 ;
            }
            
            //record if there is a dip
            if(cur < pre && max < lmax){
                max = lmax;
                maxI = lmaxI;
            }
            //record min value
            if(cur < max && minI < i+1){
                min = cur;
                minI = i + 1;
            }
            i++;
            pre = cur;
        }
        
        int result = 0;
        
        // re-create that number by swaping min and max
        while(i != 0){
            if(i == maxI){
                result =  result  + (min *  (int)(Math.pow(10,i-1)));
            }
            else if(i == minI){
                result =  result + (max * (int)(Math.pow(10,i-1)));
            }
            else result = result + ((numC / (int)(Math.pow(10,i -1 ))) * (int)(Math.pow(10,i-1)));
            
            numC = numC % (int)(Math.pow(10,i-1)) ;
            i--;
        }
        return result;
        
}
}
class Pair
{
    int ele;
    int i;
    Pair(int ele,int i)
    {
        this.ele=ele;
        this.i=i;
    }
}