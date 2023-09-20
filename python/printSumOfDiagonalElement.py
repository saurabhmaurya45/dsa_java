n = int(input())
arr = []
sum = 0
for i in range(n):
    val = input().split()
    arr.append(val)

for i in range(n):
    for j in range(n):
        if(i==j):
            sum += int(arr[i][j])

print(sum)
