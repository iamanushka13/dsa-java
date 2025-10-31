//Brute Force 
//Time complexity : O(n1*n2)

int[] visited = new int[arr2.length];
List<Integer> li = new ArrayList<>();
for(int i=0;i<arr1.length;i++){
  for(int j=0;j<arr2.length;j++){
    if(arr1[i]==arr2[j] && !visited[j]){
      li.add(arr1[i]);
      visited=1;
      break;
    }
    if(arr1[i]<arr2[j]){
      break;
    }
  }
}
return li;

//Optimal Approach
//Time Complexity : o(m+n)

int i=0, j=0;
List<Integer> li = new ArrayList<>();
while(i<m && j<n){
  if(arr1[i]<arr2[j]){
    i++;
  }
  else if(arr1[i]>arr2[j]){
    j++;
  }
  else{
    li.add(arr1[i]);
    i++;
    j++;
  }
}
return li;
