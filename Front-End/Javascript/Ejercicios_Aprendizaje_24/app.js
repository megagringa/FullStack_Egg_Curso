document.getElementById('circleForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Evitar que el formulario se envíe

    const diameter = parseFloat(document.getElementById('diameter').value);
    const radius = diameter / 2;

    document.getElementById('result').textContent = radius.toFixed(2);
});