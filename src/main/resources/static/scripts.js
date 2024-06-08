const switchElement = document.querySelector('.switch')

document.addEventListener('click', (event) => {
    if(event.target && event.target.matches('.switch')){
    document.body.classList.toggle('dark')
       }
})

document.addEventListener('click', function(e) {
    if (e.target.name === 'searchType' && (e.target.value === 'start date' || e.target.value === 'due date')) {
        document.getElementById('searchTerm').type = 'date';
    } else if (e.target.name === 'searchType') {
        document.getElementById('searchTerm').type = 'text';
    }
});