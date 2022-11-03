import matplotlib.pyplot as plt
import networkx as nx
from networkx.algorithms.community.centrality import girvan_newman 
G = nx.karate_club_graph()
communities = girvan_newman(G)
node_groups = []
for com in next(communities):
	node_groups.append(list(com))
print(node_groups)
color_map = []
for node in G:
	if node in node_groups[0]:
		color_map.append('blue')
	else:
		color_map.append('green')
		
nx.draw(G, node_color=color_map, with_labels=True) 
plt.show()


































"""
The clique percolation method is as follows:

1) All K cliques present in graph G are extracted.

2) A new clique graph GC is created -

a) Here each extracted K - CLIQUE is compressed as one vertex.

b) The two vertices are connected by an edge in GC if they have k - 1 common verticls.

3) connected components in GC are identified.

4) Each connected component in GC represents a community

5) Set C will be set of communities formed for G.
"""
