s = input().split(".")
res = ""
for i in range(len(s)-1,-1,-1):
    if(i== 0):
        res = res+s[i]   
    else:
         res = res+s[i]+"."
       
print(res)

