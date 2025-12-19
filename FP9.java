static int score(String word) {
    return word.replaceAll("r", "").length();
}
score("rrr")
score("arar")
List<Integer> list1 = new ArrayList<>();
list1.add(1)
list1.add(3)
list1.add(-3)
list1.add(-13)
list1.add(-5)
list1.add(4)
list1
static Comparator<String> scoreComparator = new Comparator<String>(){
    public int compare(String w1, String w2) {
        return Integer.compare(score(w2), score(w1));
    }
};
List<String> list2 = new ArrayList<>();
list2.add("aaa")
list2.add("raa")
list2.add("rasraa")
list2.add("raaaaaa")
list2.add("ashdaaaa")
list2.add("rrrrrrrrrrrraaaa")
list2
static List<String>rankedWords(List<String> words) {
    word.sort(scoreComparator);
    return words;
}
rankedWords(list2)
static List<String>rankedWords2(List<String> words) {
    return words.stream().sorted(scoreComparator).collect(Collectors.toList());
}
list2.add("cc")
list2.add("ccefegfd")
rankedWords2(list2)
static List<String>rankedWords3(Comparator<String> comparator, List<String> words) {
    return words.stream().sorted(comparator).collect(Collectors.toList());
}
rankedWords3(scoreComparator, list2)
static int scoreWithBonus(String word) {
    int base = score(word);
    if (word.contains("f")) return base + 3;
    else return base;
}
static Comparator<String> scoreWithBonusComparator = new Comparator<String>() {
    public int compare(String w1, String w2) {
        return Integer.compare(scoreWithBonus(w2), scoreWithBonus(w1));
    }
};
rankedWords3(scoreWithBonusComparator, list2)
list2.add("fa")
rankedWords3(scoreWithBonusComparator, list2)
Comparator<String> scoreComparator2 = (w1, w2) -> Integer.compare(score(w2), score(w1));
Function<String, Integer> score2 = w -> w.replaceAll("r", "").length();
Function<String, Integer> scoreWithBonus = w -> w.replaceAll("f", "ffff").length();
Comparator<String> scoreComparator3 = (w1, w2) -> Integer.compare(scoreWithBonus.apply(w2), scoreWithBonus.apply(w1));
static List<String> rankedWords4(Function<String, Integer> wordScore, List <String> words) {
    Comparator<String> wordComparator1 = (w1, w2) -> Integer.compare(wordScore.apply(w2), wordScore.apply(w1));
    return words.stream().sorted(wordComparator1).collect(collectors.toList());
}