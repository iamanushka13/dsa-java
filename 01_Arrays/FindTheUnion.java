//Brute Force
//Time complexity : O((m+n)log(m+n))

int m = arr1.length;
int n = arr2.length;
Map<Integer, Integer> mpp = new HashMap<>();
List<Integer> li = new ArrayList<>();
for(int i=0;i<m;i++){
  mpp.put(arr1[i], mpp.getOrDefault(arr1[i], 0)+1);
}
for(int i=0;i<n;i++){
  mpp.put(arr2[i], mpp.getOrDefault(arr2[i], 0)+1);
}
for(int ele: mpp){
  li.add(ele);
}
return li;

//Better Approach : Using Set
//Time Complexity :  O((m+n)log(m+n))

int m = arr1.length;
int n = arr2.length;
Set<Integer> st = new HashSet<>();
List<Integer> li = new ArrayList<>();
for(int i=0;i<m;i++){
  st.add(arr1[i]);
}
for(int i=0;i<m;i++){
  st.add(arr1[i]);
}
for(int ele:st){
  li.add(ele);
}
return li;

//Optimal Approach : Two pointer
//Time complexity: O(n+m)

int i=0, j=0;
List<Integer> li = new ArrayList<>();
while(i<m && j<n){
  if(arr1[i]<=arr2[j]){
    if(li.size()==0 || li.get(li.size()-1)!=arr1[i]){
      li.add(arr1[i]);
    }
    i++;
  }
  else{
    if(li.size()==0 || li.get(li.size()-1)!=arr2[j]){
      li.add(arr2[j]);
    }
    j++;
  }
}
while(i<m){
  if(li.size()==0 || li.get(li.size()-1)!=arr1[i]){
      li.add(arr1[i]);
    }
  i++;
}
while(j<n){
  if(li.size()==0 || li.get(li.size()-1)!=arr2[j]){
      li.add(arr2[j]);
    }
  j++;
}
return li;
