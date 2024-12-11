class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        flowers = [0] + flowerbed + [0]  # Add padding of 0s at both ends

        for i in range(1, len(flowers) - 1):
            if flowers[i-1] == 0 and flowers[i] == 0 and flowers[i+1] == 0:
                flowers[i] = 1  # Plant a flower
                n -= 1  # Decrease the number of flowers left to plant

        return n <= 0

        emppty =0 if flowerbed[0] else 1
        for flower in flowerbed:
            if f:
                n-= int((empty-1)/2)
                empty =0
            else:
                empty+=1
        n-=(empty)//2
        return n<=0
