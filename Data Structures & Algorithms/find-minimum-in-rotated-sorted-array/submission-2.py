class Solution:
    def findMin(self, nums: List[int]) -> int:
        L,R = 0, len(nums)-1
        res = nums[L]
                

        while L <= R: 
            if nums[L] < nums[R]:
                res = min(nums[L], res)
                break

            mid = ( L + R ) // 2
            res = min(nums[mid], res)

            if nums[L] <= nums[mid]:
                L = mid +1
            else :
                R = mid-1
        return res