package katas.diamond

class Diamond {

    def alphabet = 'A'..'Z'

    public List<String> apply(String c) {
        def pos = alphabet.indexOf(c.toUpperCase())
        def size = (2 * pos) + 1
        def diamondRange = 0..<size

        def mid = (size / 2) as Integer

        return diamondRange.collect { i ->
            def locFromStart = Math.abs(mid - i)
            def locFromEnd = size - 1 - locFromStart
            diamondRange.collect {
                if (it == locFromStart || it == locFromEnd) alphabet[i <= mid ? i : size - i - 1] else '-'
            }
        }
    }

}
