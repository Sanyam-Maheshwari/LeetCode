class RandomizedSet {
    HashMap<Integer, Integer> map=new HashMap();
    List<Integer> values=new ArrayList();
    Random r=new Random(); 
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
        {
            return false;
        }
        values.add(val);
        map.put(val,values.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
        {
            return false;
        }
        int removeindx=map.get(val);
        map.remove(val);
        
        if(removeindx==values.size()-1)
        {
            values.remove(removeindx);
            return true;
        }
        else
        {
            values.set(removeindx,values.get(values.size()-1));
            values.remove(values.size()-1);
            map.put(values.get(removeindx), removeindx);
            return true;
        }
    }
    
    public int getRandom() {
        int randomindx=r.nextInt(values.size());
        return values.get(randomindx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */