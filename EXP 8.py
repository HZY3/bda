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
The Girvan-Newman algorithm for the detection and analysis of
community structure relies on the iterative elimination of edges 
that have the highest number of shortest paths between nodes passing through them.
By removing edges from the graph one-by-one, the network breaks down into smaller pieces,
so-called communities. The algorithm was introduced by Michelle Girvan and Mark Newman.

How does it work?​
The idea was to find which edges in a network occur most frequently 
between other pairs of nodes by finding edges betweenness centrality. 
The edges joining communities are then expected to have a high edge betweenness. 
The underlying community structure of the network will be much more fine-grained once 
the edges with the highest betweenness are eliminated which means that communities will be much easier to spot.

The Girvan-Newman algorithm can be divided into four main steps:

1.For every edge in a graph, calculate the edge betweenness centrality.
2.Remove the edge with the highest betweenness centrality.
3.Calculate the betweenness centrality for every remaining edge.
4.Repeat steps 2-4 until there are no more edges left.
"""
