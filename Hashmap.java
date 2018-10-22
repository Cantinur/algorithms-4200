public class HashMap<K, V>{

    private class Entry{
        K key;
        V value;
        Enrty(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private final int M = 997;
    private List<Entry> data = new ArrayList<>[M];

    public void put(K key, V value){
        int i = index(key);
        
        if (data[i] == null){
            data[i] = new ArrayList<>();
        }

        List<Entry> list = data[i];

        for (int j = 0; j < list.size(); j++){
            Entry e = list.get(j);
            if(key.equals(e.key)){
                e.value = value;
                return;
            }
        }
        list.add(new Enrty(key, value));
    }

    private int index(K key){
        return (key.hashCode() & 0xf7_ff_ff_ff) % M;
    }

    public void delete(K key) {
        int i = index(key);
        if(data[i] == null){return;}

        List<Enrty> list = data[i];
        
        for (int j = 0; j < list.size(); j++){ 
            Entry e = list.get(j);
            if(key.equals(e.key)){
                list.remove(j);
                return;
            }
        }
    }

    public V get(K key) {
        int i = index(key);
        
        if(data[i] == null){
            return null;
        }
        List<Entry> list = data[i];

        for(int j = 0; j < list.size(); j++){
            Entry e = lsit.get(j);
            if(key.equals(e.key)){
                return e.value;
            }
        }
        return null;
    }

    public int size(){
        int size = 0; 
        for(int i = 0; i < data.length; i++){
            if(data[i] != null){
                size = data[i].size();
            }
        }
        return size;
    }
}