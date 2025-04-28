class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry =0;
        int lastD =digits[digits.length-1] +1;
        int sum = lastD%10;
        if(lastD>=10){
            carry = lastD/10;
        }
        if(carry==0){
            for(int i =0;i<digits.length-1;i++){
                list.add(digits[i]);
            }     
            list.add(sum);
        }

        else{
            list.add(sum);
            for(int i=digits.length-2;i>=0;i--){
                sum =carry+digits[i];
                if(sum>=10){
                    carry = sum/10;
                }
                else{
                    carry =0;
                }
                list.add(0,sum%10);
            }   
        }
        if(carry!=0) list.add(0,carry);

        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}