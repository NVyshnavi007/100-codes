def minArray(nums,n):
    if n==0:
        return nums[n]
    return min(nums[n],minArray(nums,n-1))
if __name__=='__main__':
    nums = list(map(int,input("enter numbers:").split()))
    n = len(nums) - 1
    print(minArray(nums, n))