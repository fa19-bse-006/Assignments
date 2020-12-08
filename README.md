# Assignments
Bubble Sort task:
>>>>sorting array without comparing sorting part:
for(int i=0;i<arr.length;i++){
     for(int j=i+1;j<arr.lenth;j++){
     if(arr[i]>arr[j]){
     swap index value;
     }
     }
}
we initilize j=i+1 so that we don't repeat the sorted part in iteration
for example
if i=3 than j=4  that's mean value before index 3 is in sorted form so we don't compare that part,start comparing from index 3 to its higher index untill conndition become false.


