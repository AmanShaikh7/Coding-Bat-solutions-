/*
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count8(8) → 1
count8(818) → 2
count8(8818) → 4 */

public int getCount(int n, int pr){
  if(n==0){
    return 0;
  }
  int rem = n%10;
  n=n/10;
  int sans = getCount(n,rem);
  int ans =0;
  if(rem==8 && pr==8){
    ans = sans+2;
  }
  else if (rem==8){
    ans = sans +1;
  }
  else{
    ans = sans;
  }
  return ans;
}

public int count8(int n) {
  int ans = getCount(n,0);
  return ans;
 
}
