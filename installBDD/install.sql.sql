CREATE DATABASE  IF NOT EXISTS `bdd_jweb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bdd_jweb`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: bdd_jweb
-- ------------------------------------------------------
-- Server version	5.7.9-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `intitule` varchar(150) NOT NULL,
  `newstext` text NOT NULL,
  `date_save` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (2,'L\'intégrale d\'Hergé: des planches inédites de Tintin dévoilées','La semaine prochaine paraîtra le premier volume d\'une monumentale édition des oeuvres complètes d\'Hergé. L\'occasion de découvrir - en exclusivité pour L\'Express - des séquences inédites en album. Histoire de cette \"Pléiade\" qui fait souffler l\'esprit de Moulinsart sur la prestigieuse maison Gallimard.Commençons par une petite devinette: dans quel album de Tintin voit-on le fidèle Nestor lire les Pensées de Pascal? Vous ne voyez pas? Réponse: au tout début de Coke en stock. Pourtant, même si vous avez usé votre album jusqu\'à la trame à force de relectures, vous n\'avez jamais vu cette case. Parue dans le journal Tintin du 31 octobre 1956, elle n\'a en effet pas été reprise dans la version que nous connaissons tous.  Bonne nouvelle, vous allez enfin pouvoir apercevoir le majordome du capitaine Haddock plongé dans la lecture du philosophe de Port-Royal: Casterman et les éditions Moulinsart entament en effet l\'édition intégrale des albums d\'Hergé en fac-similés, tels qu\'ils sont parus dans la presse à l\'époque. Une entreprise éditoriale monumentale: 12 luxueux volumes de 500 pages, à raison de deux par an, jusqu\'en 2021. Les tintinophiles les ont déjà surnommés les \"Pléiade Tintin\". Le premier volume, dont L\'Express propose aujourd\'hui en avant-première des inédits, paraît la semaine prochaine.','2015-11-04 13:40:45'),(3,'Mickey va vivre de nouvelles aventures','C’est le secret le moins bien gardé de la bande dessinée francophone. Depuis plus d’un an, cinq auteurs, et pas des moindres, travaillent « en secret » sur des histoires de Mickey Mouse. Si les réseaux sociaux et la rumeur ont eu raison de la confidentialité requise, le Festival de bande dessinée de Lausanne, qui se tient jusqu’au 13 septembre, a mis fin pour de bon au mystère. Une exposition permet de découvrir, non pas les planches des albums, attendus pour 2016, mais divers croquis et travaux glanés auprès des auteurs concernés : Régis Loisel, Bernard Cosey, Tébo, Lewis Trondheim et Nicolas Keramidas (ces deux derniers étant associés sur une même histoire).\nLe choix d’artistes reconnus\nCe projet ne nourrit pas les fantasmes par hasard. Disney confie en effet rarement la réalisation de ses personnages à des dessinateurs extérieurs, sauf dans le cadre de contrats spécifiques lui permettant d’alimenter ses publications sur toute la planète. L’idée est, ici, de publier prioritairement les histoires en album cartonné, et d’en confier la création à des professionnels déjà (re) connus. L’initiative n’émane pas directement de la firme de Burbank (Californie), mais de l’un de ses « franchisés », l’éditeur Glénat, propriétaire depuis 2010 des droits français « en librairie » de l’univers Disney. « Les licenciés Disney du monde entier utilisent les mêmes contenus pour remplir leurs livres ou leurs revues. Etant donné qu’il manque du matériel, pourquoi ne pas créer nous-mêmes de nouvelles histoires avec nos propres auteurs ? », explique Jacques Glénat, patron...\nEn savoir plus sur http://www.lemonde.fr/m-actu/article/2015/09/11/mickey-va-vivre-de-nouvelles-aventures_4753216_4497186.html#2suKWG0pFXa3fvkm.99','2015-11-04 13:41:16'),(4,'Snoopy, star planétaire de la bande-dessinée, a son étoile à Hollywood','Los Angeles - Snoopy, le petit chien rêveur et soupe au lait des bandes dessinées \"Snoopy et les Peanuts\", vient d\'inaugurer son étoile sur la Voie de la célébrité à Hollywood, quelques jours avant la sortie d\'un film dont il est la vedette. Le \"beagle\" le plus célèbre du monde, adulé des grands et petits dans le monde entier pour ses états d\'âme ou aphorismes du genre \"je suis allergique aux matins\", ou \"je m\'y mettrai demain\", a reçu la 2.563e étoile du \"Walk of Fame\" sur Hollywood Boulevard, juste à côté de celle de son créateur, feu Charles Schultz.  Lundi, un Snoopy grandeur nature est venu accepter son étoile, prenant la pose avec les fans venus l\'acclamer.  Le petit chien blanc et noir, apparu pour la première fois il y a 65 ans, était déjà la star ce week-end de la première du film \"Snoopy et les Peanuts\", distribué par le studio 20th Century Fox, qui sort vendredi aux Etats-Unis et le 23 décembre dans les autres pays.  Snoopy, qui rêve d\'être un auteur mondialement connu ou un héros de l\'aviation de la première guerre mondiale, a une personnalité \"douce amère\", avait estimé M. Schultz, décédé en 2000.   Adepte des T-shirt \"Joe Cool\", tour à tour ultra-snob ou super-affectueux, il rejoint sur la Voie de la célébrité de nombreux personnages de bande-dessinée ou dessins animés tels que le lapin Bugs Bunny, le canard Donald Duck, la souris Mickey Mouse, l\'ogre Shrek, les Simpsons, Blanche-Neige, la fée Clochette, etc.  D\'autres chiens avaient déjà leur étoile tels que Lassie ou Rintintin. Depuis sa création, le très humain Snoopy, qui se promène sur deux pattes et passe le plus clair de son temps à divaguer sur le toit de sa niche, a conquis le monde entier. Il a fait l\'objet de 45 émissions spéciales de télévision, quatre films, sans parler des bandes-dessinées et de milliers de produits dérivés à son effigie. Les aventures de Charlie Brown, petit garçon tendre et déprimé, de ses amis et surtout de son célèbre chien ont été publiées dans plus de 2.600 journaux dans 75 pays.','2015-11-04 13:41:25');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produits`
--

DROP TABLE IF EXISTS `produits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produits` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(150) NOT NULL,
  `date_mise_vente` datetime NOT NULL,
  `createur` varchar(45) NOT NULL,
  `description` text NOT NULL,
  `quantite` int(11) NOT NULL,
  `prix` float NOT NULL,
  `path` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='ENGINE=INNODB;';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produits`
--

LOCK TABLES `produits` WRITE;
/*!40000 ALTER TABLE `produits` DISABLE KEYS */;
INSERT INTO `produits` VALUES (1,'The Calculus affair Tintin - Tome 16 : The Calculus affair','2015-11-03 00:00:00','Hergé','Une sensationnelle invention du professeur Tournesol commence par provoquer des catastrophes au château de Moulinsart : toutes les vitres volent en éclat, ainsi que la plupart des objets en verre! Malheureusement, cette trouvaille ne rejoindra pas le rayon des farces et attrapes. Des espions tentent de s\'emparer de Tournesol pour lui soutirer ses plans. Il apparaît que les kidnappeurs sont des Bordures, éternels ennemis des Syldaves et bien décidés à transformer l\'invention de Tournesol en arme de destruction massive.<br>Pour L\'Affaire Tournesol, il utilise un vrai truc d\'espion: le parapluie qui sert à cacher les microfilms de son invention dévastatrice. Vous souvenez-vous de la manière dont finissent les microfilms ? Rendez-vous dans L\'Affaire Tournesol.',4,9.99,'/images/The_Calculus_affair.jpg'),(2,'Tintin - Tome 2 : Cigars of the pharaoh','2015-11-02 00:00:00','Hergé','Les Cigares du Pharaon (ou Les Aventures de Tintin, reporter, en Orient) est le quatrième album de bande dessinée des aventures de Tintin, prépublié en noir et blanc du 8 décembre 1932 au 8 février 1934 dans les pages du Petit Vingtième, supplément du journal Le Vingtième Siècle. La version couleur de l\'album est parue en 1955.',12,8.99,'/images/Cigars_of_the_pharaoh.jpg'),(3,'Tintin - Tome 21 : Tintin and the Picaros','2015-09-12 00:00:00','Hergé','La cantatrice Bianca Castafiore est arrêtée par la police du San Theodoros pendant sa tournée sud américaine. Elle est accusée d’avoir comploté contre le pouvoir. Le général Tapioca dit avoir aussi des preuves de l’implication de Tintin, du capitaine Haddock et du professeur Tournesol. Il invite nos trois héros à venir s’expliquer, ce qu’ils font. Mais il s’agit en fait d’un piège fomenté par un de leurs anciens ennemis pour les éliminer.',22,10.99,'/images/Tintin_and_the_Picaros.jpg'),(4,'The bluecoats - Tome 9 : El padre','2015-07-22 00:00:00','Willy Lambil','Sent to scout the enemy, Blutch and Chesterfield are chased by a Confederate patrol and forced to cross the Rio Grande to safety. But that safety is relative: stuck between Apache bandits and Mexican outlaws, our two Bluecoats have no choice but to disguise themselves as civilians - Blutch as a peasant, Chesterfield as a monk. But the nearby village is eagerly awaiting its new padre, and the villagers aren\'t fooled by the deception.',32,12.99,'/images/bluecoats.jpg'),(5,'Spooks - Tome 6 : Seth','2014-12-30 00:00:00','Christian Rossi','The sixth series of the BBC espionage television series Spooks began broadcasting on 16 October 2007 before ending on 18 December 2007. The series, consisting of ten episodes, is the first where there is a story line throughout the episodes. Appearing as recurring characters are CIA Agent, Bob Hogan, and Iranian Special Consul, Dariush Bakhshi, and his wife, Ana.',42,15.99,'/images/spook.jpg');
/*!40000 ALTER TABLE `produits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `name` varchar(55) NOT NULL,
  `surname` varchar(55) NOT NULL,
  `adress` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `level` int(11) NOT NULL DEFAULT '0',
  `news_letter` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`,`date_creation`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'098f6bcd4621d373cade4e832627b4f6','','test','test','86, boulevard vivier merle','test@test.com','2015-11-08 15:39:16',1,1);
/* MDP : test*/
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bdd_jweb'
--

--
-- Dumping routines for database 'bdd_jweb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-08 17:20:56
