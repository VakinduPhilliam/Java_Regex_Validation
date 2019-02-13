String text = editText.getText().toString();
String[] words = text.split(" ");    
List<String> tags = new ArrayList<String>();

for ( String word : words) {
    if (word.substring(0, 1).equals("#")) {
        tags.add(word);    
    }
}