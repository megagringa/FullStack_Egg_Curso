document.addEventListener("DOMContentLoaded", function() {
    const paragraph = document.getElementById("paragraph");
    const words = paragraph.textContent.split(" ");

    const longWords = words.filter(word => word.length > 8);
    
    const highlightedText = words.map(word => {
        if (longWords.includes(word)) {
            return `<span style="background-color: yellow;">${word}</span>`;
        }
        return word;
    }).join(" ");

    paragraph.innerHTML = highlightedText;
});