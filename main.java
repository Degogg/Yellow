<!-- Adicione antes de fechar a tag </body> -->
<script>
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();
            document.querySelector(this.getAttribute('href')).scrollIntoView({
                behavior: 'smooth'
            });
        });
    });

    // Destaca o item ativo no menu
    window.addEventListener('scroll', () => {
        let fromTop = window.scrollY;
        document.querySelectorAll('nav a').forEach(link => {
            let section = document.querySelector(link.hash);
            if (
                section.offsetTop <= fromTop &&
                section.offsetTop + section.offsetHeight > fromTop
            ) {
                link.classList.add('active');
            } else {
                link.classList.remove('active');
            }
        });
    });
</script>
