package oracle.security.o3logon;

public final class b
{
  private static int[] a = { 160, 155, 161, 130, 162, 212, 163, 213, 164, 211, 165, 214, 166, 157, 167, 136, 168, 195, 169, 138, 170, 141, 171, 131, 172, 222, 173, 156, 174, 139, 175, 154, 176, 151, 177, 221, 178, 172, 179, 173, 180, 192, 181, 148, 182, 137, 183, 150, 184, 202, 185, 171, 186, 142, 187, 132, 188, 179, 189, 176, 190, 180, 191, 129, 192, 300, 193, 301, 194, 302, 195, 303, 196, 304, 197, 306, 198, 309, 199, 314, 200, 318, 201, 319, 202, 320, 203, 321, 204, 332, 205, 333, 206, 334, 207, 336, 208, 316, 209, 349, 210, 353, 211, 354, 212, 355, 213, 356, 214, 357, 215, 226, 216, 361, 217, 373, 218, 374, 219, 375, 220, 377, 221, 384, 222, 372, 223, 492, 224, 400, 225, 401, 226, 402, 227, 403, 228, 404, 229, 406, 230, 409, 231, 414, 232, 418, 233, 419, 234, 420, 235, 421, 236, 432, 237, 433, 238, 434, 239, 436, 240, 416, 241, 449, 242, 453, 243, 454, 244, 455, 245, 456, 246, 457, 247, 227, 248, 461, 249, 473, 250, 474, 251, 475, 252, 477, 253, 484, 254, 472, 255, 486, 256, 307, 257, 407, 258, 305, 259, 405, 260, 308, 261, 408, 262, 310, 263, 410, 264, 311, 265, 411, 266, 313, 267, 413, 268, 312, 269, 412, 270, 315, 271, 415, 272, 317, 273, 417, 274, 324, 275, 424, 276, 392, 277, 499, 278, 323, 279, 423, 280, 325, 281, 425, 282, 322, 283, 422, 284, 326, 285, 426, 286, 327, 287, 427, 288, 328, 289, 428, 290, 390, 292, 329, 293, 429, 294, 330, 295, 430, 296, 335, 297, 435, 298, 338, 299, 438, 300, 393, 301, 250, 302, 339, 303, 439, 304, 337, 305, 431, 306, 340, 307, 440, 308, 341, 309, 441, 310, 342, 311, 442, 312, 493, 313, 343, 314, 443, 315, 345, 316, 445, 317, 344, 318, 444, 319, 347, 320, 447, 321, 346, 322, 446, 323, 348, 324, 448, 325, 351, 326, 451, 327, 350, 328, 450, 329, 244, 330, 352, 331, 452, 332, 359, 333, 459, 334, 394, 335, 251, 336, 358, 337, 458, 338, 360, 339, 460, 340, 362, 341, 462, 342, 364, 343, 464, 344, 363, 345, 463, 346, 365, 347, 465, 348, 366, 349, 466, 350, 368, 351, 468, 352, 367, 353, 467, 354, 370, 355, 470, 356, 369, 357, 469, 358, 371, 359, 471, 360, 376, 361, 476, 362, 381, 363, 481, 364, 378, 365, 478, 366, 380, 367, 480, 368, 379, 369, 479, 370, 382, 371, 482, 372, 383, 373, 483, 374, 385, 375, 485, 376, 386, 377, 387, 378, 487, 379, 389, 380, 489, 381, 388, 382, 488, 402, 494, 416, 395, 417, 252, 431, 396, 432, 253, 501, 490, 710, 293, 711, 196, 713, 201, 728, 197, 729, 200, 730, 199, 731, 203, 732, 294, 733, 198, 768, 296, 818, 295, 819, 158, 900, 590, 901, 591, 902, 560, 904, 561, 905, 562, 906, 563, 908, 564, 910, 565, 911, 566, 912, 579, 913, 500, 914, 501, 915, 502, 916, 503, 917, 504, 918, 505, 919, 506, 920, 507, 921, 508, 922, 509, 923, 510, 924, 511, 925, 512, 926, 513, 927, 514, 928, 515, 929, 516, 931, 517, 932, 518, 933, 519, 934, 520, 935, 521, 936, 522, 937, 523, 938, 567, 939, 568, 940, 570, 941, 571, 942, 572, 943, 573, 944, 580, 945, 525, 946, 526, 947, 527, 948, 528, 949, 529, 950, 530, 951, 531, 952, 532, 953, 533, 954, 534, 955, 535, 956, 536, 957, 537, 958, 538, 959, 539, 960, 540, 961, 541, 962, 549, 963, 542, 964, 543, 965, 544, 966, 545, 967, 546, 968, 547, 969, 548, 970, 577, 971, 578, 972, 574, 973, 575, 974, 576, 1025, 733, 1026, 734, 1027, 735, 1028, 736, 1029, 737, 1030, 738, 1031, 739, 1032, 740, 1033, 741, 1034, 742, 1035, 743, 1036, 744, 1038, 745, 1039, 746, 1040, 700, 1041, 701, 1042, 702, 1043, 703, 1044, 704, 1045, 705, 1046, 706, 1047, 707, 1048, 708, 1049, 709, 1050, 710, 1051, 711, 1052, 712, 1053, 713, 1054, 714, 1055, 715, 1056, 716, 1057, 717, 1058, 718, 1059, 719, 1060, 720, 1061, 721, 1062, 722, 1063, 723, 1064, 724, 1065, 725, 1066, 726, 1067, 727, 1068, 728, 1069, 729, 1070, 730, 1071, 731, 1072, 750, 1073, 751, 1074, 752, 1075, 753, 1076, 754, 1077, 755, 1078, 756, 1079, 757, 1080, 758, 1081, 759, 1082, 760, 1083, 761, 1084, 762, 1085, 763, 1086, 764, 1087, 765, 1088, 766, 1089, 767, 1090, 768, 1091, 769, 1092, 770, 1093, 771, 1094, 772, 1095, 773, 1096, 774, 1097, 775, 1098, 776, 1099, 777, 1100, 778, 1101, 779, 1102, 780, 1103, 781, 1105, 783, 1106, 784, 1107, 785, 1108, 786, 1109, 787, 1110, 788, 1111, 789, 1112, 790, 1113, 791, 1114, 792, 1115, 793, 1116, 794, 1118, 795, 1119, 796, 1456, 927, 1457, 928, 1458, 929, 1459, 930, 1460, 931, 1461, 932, 1462, 933, 1463, 934, 1464, 935, 1465, 936, 1467, 937, 1468, 938, 1469, 939, 1470, 940, 1471, 941, 1472, 942, 1473, 943, 1474, 944, 1475, 945, 1488, 900, 1489, 901, 1490, 902, 1491, 903, 1492, 904, 1493, 905, 1494, 906, 1495, 907, 1496, 908, 1497, 909, 1498, 910, 1499, 911, 1500, 912, 1501, 913, 1502, 914, 1503, 915, 1504, 916, 1505, 917, 1506, 918, 1507, 919, 1508, 920, 1509, 921, 1510, 922, 1511, 923, 1512, 924, 1513, 925, 1514, 926, 1520, 946, 1521, 947, 1522, 948, 1523, 949, 1524, 950, 1548, 650, 1563, 651, 1567, 652, 1569, 600, 1570, 601, 1571, 602, 1572, 603, 1573, 604, 1574, 605, 1575, 606, 1576, 607, 1577, 608, 1578, 609, 1579, 610, 1580, 611, 1581, 612, 1582, 613, 1583, 614, 1584, 615, 1585, 616, 1586, 617, 1587, 618, 1588, 619, 1589, 620, 1590, 621, 1591, 622, 1592, 623, 1593, 624, 1594, 625, 1600, 626, 1601, 627, 1602, 628, 1603, 629, 1604, 630, 1605, 631, 1606, 632, 1607, 633, 1608, 634, 1609, 635, 1610, 636, 1611, 637, 1612, 638, 1613, 639, 1614, 640, 1615, 641, 1616, 642, 1617, 643, 1618, 644, 1632, 670, 1633, 671, 1634, 672, 1635, 673, 1636, 674, 1637, 675, 1638, 676, 1639, 677, 1640, 678, 1641, 679, 1642, 653, 1643, 654, 1644, 655, 1645, 656, 1648, 680, 1649, 681, 1657, 686, 1662, 682, 1670, 683, 1672, 692, 1681, 687, 1688, 684, 1700, 688, 1711, 685, 1722, 693, 1723, 689, 1746, 690, 1749, 691, 2305, 1300, 2306, 1301, 2307, 1302, 2309, 1303, 2310, 1304, 2311, 1305, 2312, 1306, 2313, 1307, 2314, 1308, 2315, 1309, 2316, 1310, 2317, 1311, 2318, 1312, 2319, 1313, 2320, 1314, 2321, 1315, 2322, 1316, 2323, 1317, 2324, 1318, 2325, 1319, 2326, 1320, 2327, 1321, 2328, 1322, 2329, 1323, 2330, 1324, 2331, 1325, 2332, 1326, 2333, 1327, 2334, 1328, 2335, 1329, 2336, 1330, 2337, 1331, 2338, 1332, 2339, 1333, 2340, 1334, 2341, 1335, 2342, 1336, 2343, 1337, 2344, 1338, 2345, 1339, 2346, 1340, 2347, 1341, 2348, 1342, 2349, 1343, 2350, 1344, 2351, 1345, 2352, 1346, 2353, 1347, 2354, 1348, 2355, 1349, 2356, 1350, 2357, 1351, 2358, 1352, 2359, 1353, 2360, 1354, 2361, 1355, 2364, 1356, 2365, 1357, 2366, 1358, 2367, 1359, 2368, 1360, 2369, 1361, 2370, 1362, 2371, 1363, 2372, 1364, 2373, 1365, 2374, 1366, 2375, 1367, 2376, 1368, 2377, 1369, 2378, 1370, 2379, 1371, 2380, 1372, 2381, 1373, 2384, 1374, 2385, 1375, 2386, 1376, 2387, 1377, 2388, 1378, 2392, 1379, 2393, 1380, 2394, 1381, 2395, 1382, 2396, 1383, 2397, 1384, 2398, 1385, 2399, 1386, 2400, 1387, 2401, 1388, 2402, 1389, 2403, 1390, 2404, 1391, 2405, 1392, 2406, 1393, 2407, 1394, 2408, 1395, 2409, 1396, 2410, 1397, 2411, 1398, 2412, 1399, 2413, 1400, 2414, 1401, 2415, 1402, 2416, 1403, 2433, 1474, 2434, 1472, 2435, 1473, 2437, 1461, 2438, 1462, 2439, 1463, 2440, 1464, 2441, 1465, 2442, 1466, 2443, 1467, 2447, 1468, 2448, 1469, 2451, 1470, 2452, 1471, 2453, 1475, 2454, 1476, 2455, 1477, 2456, 1478, 2457, 1479, 2458, 1480, 2459, 1481, 2460, 1482, 2461, 1483, 2462, 1484, 2463, 1485, 2464, 1486, 2465, 1487, 2466, 1489, 2467, 1491, 2468, 1492, 2469, 1493, 2470, 1494, 2471, 1495, 2472, 1496, 2474, 1497, 2475, 1498, 2476, 1499, 2477, 1500, 2478, 1501, 2479, 1502, 2480, 1504, 2482, 1505, 2486, 1506, 2487, 1507, 2488, 1508, 2489, 1509, 2494, 1510, 2495, 1511, 2496, 1512, 2497, 1513, 2498, 1514, 2499, 1515, 2503, 1516, 2504, 1517, 2507, 1518, 2508, 1519, 2524, 1488, 2525, 1490, 2527, 1503, 2534, 1451, 2535, 1452, 2536, 1453, 2537, 1454, 2538, 1455, 2539, 1456, 2540, 1457, 2541, 1458, 2542, 1459, 2543, 1460, 2547, 1450, 3585, 801, 3586, 802, 3587, 803, 3588, 804, 3589, 805, 3590, 806, 3591, 807, 3592, 808, 3593, 809, 3594, 810, 3595, 811, 3596, 812, 3597, 813, 3598, 814, 3599, 815, 3600, 816, 3601, 817, 3602, 818, 3603, 819, 3604, 820, 3605, 821, 3606, 822, 3607, 823, 3608, 824, 3609, 825, 3610, 826, 3611, 827, 3612, 828, 3613, 829, 3614, 830, 3615, 831, 3616, 832, 3617, 833, 3618, 834, 3619, 835, 3620, 836, 3621, 837, 3622, 838, 3623, 839, 3624, 840, 3625, 841, 3626, 842, 3627, 843, 3628, 844, 3629, 845, 3630, 846, 3631, 847, 3632, 848, 3633, 849, 3634, 850, 3635, 851, 3636, 852, 3637, 853, 3638, 854, 3639, 855, 3640, 856, 3641, 857, 3642, 858, 3647, 863, 3648, 864, 3649, 865, 3650, 866, 3651, 867, 3652, 868, 3653, 869, 3654, 870, 3655, 871, 3656, 872, 3657, 873, 3658, 874, 3659, 875, 3660, 876, 3661, 877, 3662, 878, 3663, 879, 3664, 880, 3665, 881, 3666, 882, 3667, 883, 3668, 884, 3669, 885, 3670, 886, 3671, 887, 3672, 888, 3673, 889, 3674, 890, 3675, 891, 7841, 254, 7843, 266, 7845, 1604, 7847, 1601, 7849, 1602, 7851, 1603, 7853, 256, 7855, 269, 7857, 267, 7859, 268, 7861, 1600, 7863, 255, 7865, 257, 7867, 1605, 7869, 1606, 7871, 1610, 7873, 1607, 7875, 1608, 7877, 1609, 7879, 258, 7881, 1611, 7883, 259, 7885, 260, 7887, 1612, 7889, 1616, 7891, 1613, 7893, 1614, 7895, 1615, 7897, 261, 7899, 1620, 7901, 1617, 7903, 1618, 7905, 1619, 7907, 262, 7909, 263, 7911, 1621, 7913, 1625, 7915, 1622, 7917, 1623, 7919, 1624, 7921, 264, 7923, 1626, 7925, 265, 7927, 1627, 7929, 1628, 8199, 290, 8201, 291, 8203, 280, 8204, 282, 8205, 283, 8206, 284, 8207, 285, 8211, 292, 8213, 153, 8216, 146, 8217, 147, 8218, 174, 8220, 133, 8221, 134, 8222, 175, 8223, 135, 8224, 185, 8225, 186, 8226, 187, 8230, 188, 8234, 286, 8235, 287, 8237, 288, 8238, 289, 8240, 189, 8242, 190, 8243, 191, 8244, 204, 8248, 193, 8249, 205, 8250, 206, 8260, 238, 8319, 170, 8355, 217, 8356, 216, 8359, 218, 8362, 219, 8364, 1999, 8453, 144, 8470, 143, 8482, 140, 8486, 149, 8531, 177, 8532, 178, 8539, 181, 8540, 182, 8541, 183, 8542, 184, 8592, 161, 8593, 163, 8594, 162, 8595, 164, 8706, 239, 8710, 242, 8718, 152, 8719, 241, 8721, 240, 8730, 229, 8734, 230, 8744, 228, 8745, 231, 8747, 232, 8764, 194, 8776, 233, 8800, 223, 8801, 234, 8804, 225, 8805, 224, 8901, 235, 8976, 243, 8992, 236, 8993, 237, 9472, 1000, 9474, 1001, 9484, 1002, 9488, 1003, 9492, 1004, 9496, 1005, 9500, 1006, 9508, 1007, 9516, 1008, 9524, 1009, 9532, 1010, 9552, 1011, 9553, 1012, 9554, 1013, 9555, 1014, 9556, 1015, 9557, 1016, 9558, 1017, 9559, 1018, 9560, 1019, 9561, 1020, 9562, 1021, 9563, 1022, 9564, 1023, 9565, 1024, 9566, 1025, 9567, 1026, 9568, 1027, 9569, 1028, 9570, 1029, 9571, 1030, 9572, 1031, 9573, 1032, 9574, 1033, 9575, 1034, 9576, 1035, 9577, 1036, 9578, 1037, 9579, 1038, 9580, 1039, 9600, 1040, 9604, 1041, 9608, 1042, 9612, 1043, 9616, 1044, 9617, 1045, 9618, 1046, 9619, 1047, 9670, 270, 9671, 271, 9674, 272, 9834, 145, 63638, 1553, 63639, 1552, 63640, 1551, 63641, 1550, 63642, 1549, 63643, 1548, 63644, 1547, 63645, 1546, 63646, 1545, 63647, 1544, 63648, 1543, 63649, 1542, 63650, 1541, 63651, 1540, 63652, 1539, 63653, 1538, 63654, 1537, 63655, 1536, 63656, 1535, 63657, 1534, 63658, 1533, 63659, 1532, 63660, 1531, 63661, 1530, 63662, 1529, 63663, 1528, 63664, 1527, 63665, 1526, 63666, 1525, 63667, 1524, 63668, 1523, 63669, 1522, 63670, 1521, 63671, 1520, 63672, 1141, 63673, 1140, 63674, 1139, 63675, 1138, 63676, 1137, 63677, 1136, 63678, 1135, 63679, 1134, 63680, 1133, 63681, 1132, 63682, 1131, 63683, 1130, 63684, 1129, 63685, 1128, 63686, 1127, 63687, 1126, 63688, 1125, 63689, 1124, 63690, 1123, 63691, 1122, 63692, 1121, 63693, 1120, 63694, 1119, 63695, 1118, 63696, 1117, 63697, 1116, 63698, 1115, 63699, 1114, 63700, 1113, 63701, 1112, 63702, 1111, 63703, 1110, 63704, 1109, 63705, 1108, 63706, 1107, 63707, 1106, 63708, 1105, 63709, 1104, 63710, 1103, 63711, 1102, 63712, 1101, 63713, 1100, 63714, 995, 63715, 994, 63716, 993, 63717, 992, 63718, 991, 63719, 990, 63720, 989, 63721, 988, 63722, 987, 63723, 986, 63724, 985, 63725, 984, 63726, 983, 63727, 982, 63728, 981, 63729, 980, 63730, 957, 63731, 664, 63732, 658, 63733, 657, 63734, 498, 63735, 491, 63736, 437, 63737, 391, 63738, 331, 63739, 274, 63740, 273, 63741, 215, 63742, 160, 63743, 159, 64256, 495, 64257, 496, 64258, 497, 64287, 956, 64298, 951, 64299, 952, 64309, 953, 64316, 954, 64331, 955, 64606, 665, 64607, 666, 64608, 667, 64609, 668, 64610, 669, 65269, 660, 65271, 661, 65273, 662, 65275, 663, 65279, 281, 65377, 1200, 65378, 1201, 65379, 1202, 65380, 1203, 65381, 1204, 65382, 1205, 65383, 1206, 65384, 1207, 65385, 1208, 65386, 1209, 65387, 1210, 65388, 1211, 65389, 1212, 65390, 1213, 65391, 1214, 65392, 1215, 65393, 1216, 65394, 1217, 65395, 1218, 65396, 1219, 65397, 1220, 65398, 1221, 65399, 1222, 65400, 1223, 65401, 1224, 65402, 1225, 65403, 1226, 65404, 1227, 65405, 1228, 65406, 1229, 65407, 1230, 65408, 1231, 65409, 1232, 65410, 1233, 65411, 1234, 65412, 1235, 65413, 1236, 65414, 1237, 65415, 1238, 65416, 1239, 65417, 1240, 65418, 1241, 65419, 1242, 65420, 1243, 65421, 1244, 65422, 1245, 65423, 1246, 65424, 1247, 65425, 1248, 65426, 1249, 65427, 1250, 65428, 1251, 65429, 1252, 65430, 1253, 65431, 1254, 65432, 1255, 65433, 1256, 65434, 1257, 65435, 1258, 65436, 1259, 65437, 1260, 65438, 1261, 65439, 1262, 65440, 1263, 65533, 128 };
  private static int[] b = { 160, 32, 161, 33, 163, 35, 165, 89, 166, 124, 171, 60, 173, 45, 180, 39, 187, 62, 192, 65, 193, 65, 194, 65, 196, 65, 199, 67, 200, 69, 201, 69, 202, 69, 203, 69, 204, 73, 205, 73, 206, 73, 207, 73, 210, 79, 211, 79, 212, 79, 214, 79, 217, 85, 218, 85, 219, 85, 220, 85, 221, 89, 224, 97, 225, 97, 226, 97, 228, 97, 231, 99, 232, 101, 233, 101, 234, 101, 235, 101, 236, 105, 237, 105, 238, 105, 239, 105, 242, 111, 243, 111, 244, 111, 246, 111, 249, 117, 250, 117, 251, 117, 252, 117, 253, 121, 255, 121, 258, 65, 259, 97, 260, 65, 261, 97, 262, 67, 263, 99, 268, 67, 269, 99, 270, 68, 271, 100, 272, 68, 273, 100, 280, 69, 281, 101, 282, 69, 283, 101, 313, 76, 314, 108, 317, 76, 318, 108, 321, 76, 322, 108, 323, 78, 324, 110, 327, 78, 328, 110, 336, 79, 337, 111, 340, 82, 341, 114, 344, 82, 345, 114, 346, 83, 347, 115, 350, 83, 351, 115, 352, 83, 353, 115, 354, 84, 355, 116, 356, 84, 357, 116, 366, 85, 367, 117, 368, 85, 369, 117, 377, 90, 378, 122, 379, 90, 380, 122, 381, 90, 382, 122, 8213, 45, 8216, 96, 8248, 94, 8356, 76, 8764, 126, 63741, 102 };
  private static int c = b.length / 2;
  private static int d = a.length / 2;

  public final byte[] a(String paramString1, String paramString2, boolean paramBoolean)
  {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    return arrayOfByte2 = a(arrayOfByte1 = b(paramString1, paramString2, paramBoolean));
  }

  public final byte[] a(String paramString1, String paramString2)
  {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    return arrayOfByte2 = a(arrayOfByte1 = b(paramString1, paramString2, true));
  }

  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a locala = new a();
    byte[] arrayOfByte = b(paramArrayOfByte2);
    locala.a(paramArrayOfByte1, arrayOfByte, 1);
    return arrayOfByte;
  }

  public static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a locala;
    (locala = new a()).a(paramArrayOfByte1);
    byte[] arrayOfByte;
    return arrayOfByte = locala.a(paramArrayOfByte2, false);
  }

  private byte[] b(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = paramString1.length();
    int j = paramString2.length();
    int k;
    byte[] arrayOfByte = new byte[((k = (i + j) * 2) % 8 > 0 ? k / 8 + 1 : k / 8) * 8];
    int m = a(paramString1, arrayOfByte, 0, paramBoolean);
    a(paramString2, arrayOfByte, m, paramBoolean);
    return arrayOfByte;
  }

  private static byte[] a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    byte[] arrayOfByte3 = { 1, 35, 69, 103, -119, -85, -51, -17 };
    a locala;
    (locala = new a()).a(arrayOfByte3);
    arrayOfByte1 = locala.a(paramArrayOfByte, true);
    locala.a(arrayOfByte1);
    return arrayOfByte2 = locala.a(paramArrayOfByte, true);
  }

  private int a(String paramString, byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    int k = paramString.length();
    int j;
    for (j = 0; j < k; j++)
    {
      char c1;
      int i = (c1 = paramString.charAt(j) < '\200' ? Character.toUpperCase(paramString.charAt(j)) : paramBoolean ? Character.toUpperCase((char)(i = a(b, paramString.charAt(j)))) : (paramBoolean) && (paramString.charAt(j) < '\200') ? Character.toUpperCase(paramString.charAt(j)) : 63) < 128 ? c1 : a(a, c1);
      paramArrayOfByte[(paramInt + j * 2)] = ((byte)(i >> 8));
      paramArrayOfByte[(paramInt + j * 2 + 1)] = ((byte)i);
    }
    return paramInt + j * 2;
  }

  private static int a(int[] paramArrayOfInt, char paramChar)
  {
    int m = paramChar;
    int i = 0;
    int j = (paramArrayOfInt == b ? c : d) - 1;
    int k;
    while (true)
    {
      k = (i + j) / 2;
      if (m == paramArrayOfInt[(k * 2)])
        return paramArrayOfInt[(k * 2 + 1)];
      if (m <= paramArrayOfInt[(k * 2)])
        break;
      i = k + 1;
    }
    return 63;
  }

  private static byte[] b(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length / 2];
    for (int i = 0; i < arrayOfByte.length; i++)
    {
      arrayOfByte[i] = ((byte)(a(paramArrayOfByte[(i * 2)]) << 4));
      int tmp31_30 = i;
      byte[] tmp31_29 = arrayOfByte;
      tmp31_29[tmp31_30] = ((byte)(tmp31_29[tmp31_30] | a(paramArrayOfByte[(i * 2 + 1)])));
    }
    return arrayOfByte;
  }

  private static byte a(byte paramByte)
  {
    byte i;
    return i = (paramByte >= 48) && (paramByte <= 57) ? (byte)(paramByte - 48) : (paramByte >= 65) && (paramByte <= 70) ? (byte)(paramByte - 65 + 10) : (paramByte >= 97) && (paramByte <= 102) ? (byte)(paramByte - 97 + 10) : paramByte;
  }
}