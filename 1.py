class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}
        for i,v in enumerate (nums):
            if target-v in hashmap:
                return i, hashmap[target-v]
            else:
                hashmap[v] =i

        
