import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return myCollection.addAll(theirCollection) && theirCollection.addAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) return new HashSet<>();
        Set<String> newSet = new HashSet<>();
        int count = 0;
        for (String s: collections.getFirst()){
            for (Set ss: collections){
                if (! ss.contains(s)) {
                    break;
                }
                else count += 1;
            }
            if (count == collections.size()) newSet.add(s);
            count = 0;
        }
        return newSet;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> newSet = new HashSet<>();
        for (Set<String> l: collections){
            newSet.addAll(l);
        }
        return newSet;
    }
}
