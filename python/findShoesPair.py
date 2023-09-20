n = int(input())
arr = []
temparr = arr
count = 0
for i in range(n):
    val = input().split()
    arr.append(val)

for i in range(n-1):
    for j in  range(i+1,n):
        if(arr[i][0] == arr[j][0] and arr[i][1] != arr[j][1]):
            count +=1

print(count)
    
