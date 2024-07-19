--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3
-- Dumped by pg_dump version 16.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: libros; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.libros (
    id integer NOT NULL,
    titulo character varying(255),
    autor character varying(255),
    pdf_path character varying(1000),
    imagen_path character varying(1000),
    resumen text
);


ALTER TABLE public.libros OWNER TO postgres;

--
-- Name: libros_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.libros_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.libros_id_seq OWNER TO postgres;

--
-- Name: libros_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.libros_id_seq OWNED BY public.libros.id;


--
-- Name: libros id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.libros ALTER COLUMN id SET DEFAULT nextval('public.libros_id_seq'::regclass);


--
-- Data for Name: libros; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.libros (id, titulo, autor, pdf_path, imagen_path, resumen) FROM stdin;
1	Trono de Cristal	Sarah J. Maas	src/main/resources/Trono de cristal.pdf	src/main/resources/libro1.jpg	Un corazón de hielo. Una voluntad de hierro. Bella. Letal. Destinada a la grandeza. Conoce a la asesina\n\nCelaena Sardothien, la única capaz de salvar al reino de Endovier.\n\nDos hombres la aman. El mundo entero le teme. Y sólo ella puede salvarse a sí misma.\n\nDescubre la primera parte de la trilogía Trono de Cristal, serie bestseller de The New York Times. Seleccionada como Mejor libro para jóvenes de Kirkus Review.\n\nEn un mundo sin magia, y tras un año de trabajos forzados en las minas de sal, una joven asesina es convocada a palacio. Ella no acude para acabar con el sanguinario rey que gobierna desde su trono de cristal, sino para conquistar su propia libertad. Si vence a veintitrés asesinos, ladrones y guerreros en una competencia a vida o muerte, será absuelta de prisión para ejercer como campeona real. Su nombre es Celaena Sardothien.\n\nEl príncipe la provocará. El capitán de la guardia la protegerá. Una princesa de lejanas tierras se convertirá en su amiga. Pero algo maligno mora en el castillo y está ahí para matar. Mientras sus competidores van cayendo uno a uno, la lucha de Celaena por su liberación se convierte en una lucha por la sobrevivencia y en una incesante búsqueda del origen del mal antes de que destruya su mundo.\n\nLa crítica ha opinado:\n\n"Una lectura indispensable para los amantes de la fantasía épica y los cuentos de hadas." -USA Today-\n\n"Los fans de George R. R. Martin se llevarán este libro." -RT Book Reviews-\n\n"Los fans de Juego de tronos y Los juegos del hambre quedarán encantados."\n\nColleen Houck, autora de la serie Tiger's Curse
2	Heredera de Fuego	Sarah J. Maas	src/main/resources/Heredera de fuego.pdf	src/main/resources/libro3.jpg	Ella es la heredera de ceniza y fuego, y no se doblegará ante nadie.\n\nDescubre la tercera parte de la trilogía Trono de Cristal, serie bestseller de The New York Times.\n\nLa asesina del rey enfrenta el desafío de un destino aún más importante y arde con un resplandor más impresionante que nunca antes en Heredera de fuego, continuación del bestseller Corona de sangre.\n\nCelaena Sardothien ha sobrevivido a mortíferos combates y a la demoledora experiencia del desamor, pero a un costo indescriptible. Ahora debe viajar a una nueva tierra para enfrentar su más oscuro pasado, una verdad sobre su historia que podría darle un vuelco a su vida, y a su futuro, para siempre.\n\nMientras tanto, brutales y monstruosas fuerzas se van reuniendo en el horizonte e intentan esclavizar su mundo. Para derrotarlos, Celaena debe hallar la fortaleza no solo para combatir a sus propios demonios internos, sino para vencer al mal que está a punto de desencadenarse.\n\nLa crítica ha opinado:\n\n"Los lectores van a devorar esta última entrega de Sarah J. Maas... Una adquisición obligada." -School Library Journal-\n\n"Una avalancha de tensión con giros devastadores y un desenlace absolutamente fascinante. Dejará a los lectores ávidos de más." -Kirkus Reviews-\n\n"¡Temía soltar este libro!" -Tamora Pierce, autora bestseller de The New York Times-
3	Corona de Medianoche	Sarah J. Maas	src/main/resources/Corona de medianoche.pdf	src/main/resources/libro2.jpg	Antes era letal. Ahora es invencible. Ella es la mayor asesina que su mundo haya conocido jamás. Ella es la única esperanza del reino. Pero, ¿a dónde la conducen su conciencia y su corazón?\n\nDescubre la segunda parte de la trilogía Trono de Cristal, serie bestseller de The New York Times.\n\nEl mal corona a la bella asesina de palacio. Guiada por el deber y dividida por el amor, Celaena Sardothien afronta duras encrucijadas.\n\nVuelve la asesina palaciega, el arma más letal del reino de Endovier. Su encomienda es cobrar la sangre de los enemigos del rey Adarlan para comprar su libertad. Pero Celaena se niega a aceptar con sumisión las macabras órdenes del monarca de Endovier, cuya alma es oscura como boca de lobo, y secretamente se convierte en disidente de la corona, poniendo en riesgo todo lo que ha aprendido a querer, a la princesa de corazón rebelde, al atractivo capitán de la guardia y al príncipe.\n\nMantener aquella farsa se vuelve cada vez más difícil cuando Celaena se da cuenta de que no es la única que busca justicia. Sin embargo, se empeña en desentrañar los misterios que yacen en lo más hondo del castillo de cristal. Celaena se verá obligada a renunciar a lo más preciado para ella y tendrá que definir de una vez por todas a qué le debe lealtad, aquello por lo que está más dispuesta a luchar.\n\nLa crítica ha opinado:\n\n"Los lectores de fantasía épica se verán deliciosamente inmersos en esta historia, nunca querrán que acabe" -Kirkus Reviews-\n\n"Un emocionante viaje de proporciones épicas" -USA Today-\n\nLa crítica ha opinado:\n\n"Los lectores de fantasía épica se verán deliciosamente inmersos en esta historia, nunca querrán que acabe" -Kirkus Reviews-\n\n"Un emocionante viaje de proporciones épicas" -USA Today-
4	Reina de Sombras	Sarah J. Maas	src/main/resources/Reina de sombras.pdf	src/main/resources/libro4.jpg	La serie bestseller de The New York Times, Trono de Cristal, alcanza nuevas alturas en este cuarto volumen.\n\nContinúa el viaje épico de Celaena, cuya intensidad va en aumento hasta alcanzar una apasionada y terrible crisis que podría destrozar su mundo.\n\nUna épica travesía que ha cautivado los corazones y la imaginación de millones de personas en todo el mundo y que en su cuarta entrega mantendrá a los lectores embelesados mientras la historia de Celaena avanza in crescendo, a un ritmo de infarto que sacudirá el orbe de la nueva reina.\n\nCelaena Sardothien ha perdido a todos aquellos que ama, pero por fin está de vuelta en el imperio para vengarse, para rescatar su reino, antesglorioso, y para enfrentar las sombras de su pasado... Ha reconocido su identidad como Aelin Galathynius, reina de Terrasen. Pero antes de reclamar su trono deberá luchar.\n\nLuchará por su primo, un guerrero dispuesto a morir por volver a verla. Luchará por su amigo, un joven atrapado en una prisión inenarrable. Y luchará por su gente, que aguarda esclavizada, bajo el yugo de un inhumano rey, el retorno triunfal de su reina perdida.\n\nLa crítica ha opinado:\n\n"Las motivaciones y las interacciones de los personajes aparecen siempre muy acertadas y con delicados matices, en especial conforme la creciente madurez de Aelin le ofrece nuevas perspectivas sobre viejos conocidos. Imposible dejar de leer." Kirkus Reviews\n\n"A los fans de las series de fantasía intensa les tendrá totalmente sin cuidado la prolongada historia, cargada como viene de amenazantes miradas, tensión sexual a punto de ebullición, sinuosos giros de la trama, sarcástico humor y una exuberante construcción del universo. Los capítulos finales de esta entrega"\n\nBooklist
\.


--
-- Name: libros_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.libros_id_seq', 20, true);


--
-- Name: libros libros_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.libros
    ADD CONSTRAINT libros_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

