class MyHashSet {
    List<Integer> set;
    int size = 0;

    public MyHashSet() {
        set = new ArrayList<>();
        size = 0;
    }
    
    public void add(int key) {
        if(size == 0) {
            set.add(key);
        }
        else {
            boolean contains = false;
            for(int i=0; i<size; i++) {
                if(set.get(i) == key) {
                    contains = true;
                    break;
                }
            }
            if(!contains) {
                set.add(key);
            }

        }
        size = set.size();
        
    }
    
    public void remove(int key) {
        set.remove( Integer.valueOf(key) );
        size = set.size();
    }
    
    public boolean contains(int key) {
        return set.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */