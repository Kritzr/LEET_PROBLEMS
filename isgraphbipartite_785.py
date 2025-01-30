class Solution:
    def isBipartite(self, graph: List[List[int]]) -> bool:
        n = len(graph)
        state = [0] * n
        for start in range(n):
            if state[start] == 0:
                queue = deque([start])
                state[start] =1
                while queue:
                    node = queue.popleft()
                    for adjacent in graph[node]:
                        if state[adjacent] == 0:
                            state[adjacent]= -state[node]
                            queue.append(adjacent)
                        elif state[adjacent] ==state[node]:
                            return False
        return True
