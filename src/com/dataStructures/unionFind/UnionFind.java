package com.dataStructures.unionFind;

public class UnionFind {
    int numComponents;
    int par[];
    int sizes[];
    int size;
    public UnionFind(int size){
        this.size = size;
        par = new int[size];
        sizes = new int[size];
        for(int i=0;i<size;i++){
            this.par[i] = i;
            this.sizes[i] = 1;
        }
        this.numComponents = size; //In the beginning all are different components.
    }

    public int findPar(int a){
        int root = a;
        while(root != par[root]){
            root = par[root];
        }

        while(a != root){
            //just pointing to the grand parent nodes.
            int next = par[a];
            par[a] = root;
            a = next;
        }
        return root;
    }

    public boolean isConnected(int a, int b){
        return findPar(a) == findPar(b);
    }

    public int getNumComponents(){
        return this.numComponents;
    }

    public int getSizeOfComponent(int a){
        return sizes[a];
    }

    public void unify(int a, int b){
        int aPar = findPar(a);
        int bPar = findPar(b);
        if(aPar == bPar){
            return;
            //already in a same set
        }
        if(sizes[a] < sizes[b]){
            //merge a's set into b's set.
            sizes[b] += sizes[a];
            par[a] = b;
            sizes[a] = 0;
        } else {
            sizes[a] += sizes[b];
            par[b] = a;
            sizes[b] = 0;
        }
        numComponents--;
    }

}
