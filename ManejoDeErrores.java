import java_cup.runtime.*;
public class ManejoDeErrores{

    public String Errores(int tipo){
        String men=" ";
        switch (tipo){
          case 0:men = "E=0 No hay nada que analizar";break;
          case 1:men = "E=1 Algo salió mal verifica el inicio del programa";break;
          case 2:men = "E=2 Verifica el método SETUP";break;
          case 3:men = "E=3 Falta una llave que abre { en la frecuencia del oscilador";break;
          case 4:men = "E=4 Verifica el método SETUP, que este presente en el programa";break;
          case 5:men = "E=5 Falta una llave en el metodo SETUP";break;
          case 6:men = "E=6 Verifica el RETARDO y el método CICLO.";break;
          case 7:men = "E=7 En el metodo MAIN falta una llave";break;
          case 8:men = "E=8 Verifica el ID";break;
          case 9:men = "E=9 Verifica que el metodo SETUP contenga la palabra reservada VOID";break;
          case 10:men = "E=10        ";break;
          case 11:men = "E=11        ";break;
          case 12:men = "E=12        ";break;
          case 13:men = "E=13        ";break;
          case 14:men = "E=14        ";break;
          case 15:men = "E=15        ";break;
          case 16:men = "E=16        ";break;
          case 17:men = "E=17        ";break;
          case 18:men = "E=18        ";break;
          case 19:men = "E=19        ";break;
          case 20:men = "E=20        ";break;
          case 21:men = "E=21        ";break;
          case 22:men = "E=22        ";break;
          case 23:men = "E=23        ";break;
          case 24:men = "E=24        ";break;
          case 25:men = "E=25        ";break;
          case 26:men = "E=26        ";break;
          case 27:men = "E=27        ";break;
          case 28:men = "E=28        ";break;
          case 29:men = "E=29        ";break;
          case 30:men = "E=30        ";break;
          case 31:men = "E=31        ";break;
          case 32:men = "E=32        ";break;
          case 33:men = "E=33        ";break;
          case 34:men = "E=34        ";break;
          case 35:men = "E=35        ";break;
          case 36:men = "E=36        ";break;
          case 37:men = "E=37        ";break;
          case 38:men = "E=38        ";break;
          case 39:men = "E=39        ";break;
          case 40:men = "E=40        ";break;
          case 41:men = "E=41        ";break;
          case 42:men = "E=42        ";break;
          case 43:men = "E=43        ";break;
          case 44:men = "E=44        ";break;
          case 45:men = "E=45        ";break;
          case 46:men = "E=46        ";break;
          case 47:men = "E=47        ";break;
          case 48:men = "E=48        ";break;
          case 49:men = "E=49        ";break;
          case 50:men = "E=50        ";break;
          case 51:men = "E=51        ";break;
          case 52:men = "E=52        ";break;
          case 53:men = "E=53        ";break;
          case 54:men = "E=54        ";break;
          case 55:men = "E=55        ";break;
          case 56:men = "E=56        ";break;
          case 57:men = "E=57        ";break;
          case 58:men = "E=58        ";break;
          case 59:men = "E=59        ";break;
          case 60:men = "E=60        ";break;
          case 61:men = "E=61        ";break;
          case 62:men = "E=62        ";break;
          case 63:men = "E=63        ";break;
          case 64:men = "E=64        ";break;
          case 65:men = "E=65        ";break;
          case 66:men = "E=66        ";break;
          case 67:men = "E=67        ";break;
          case 68:men = "E=68        ";break;
          case 69:men = "E=69        ";break;
          case 70:men = "E=70        ";break;
          case 71:men = "E=71        ";break;
          case 72:men = "E=72        ";break;
          case 73:men = "E=73        ";break;
          case 74:men = "E=74        ";break;
          case 75:men = "E=75        ";break;
          case 76:men = "E=76        ";break;
          case 77:men = "E=77        ";break;
          case 78:men = "E=78        ";break;
          case 79:men = "E=79        ";break;
          case 80:men = "E=80        ";break;
          case 81:men = "E=81        ";break;
          case 82:men = "E=82        ";break;
          case 83:men = "E=83        ";break;
          case 84:men = "E=84        ";break;
          case 85:men = "E=85        ";break;
          case 86:men = "E=86        ";break;
          case 87:men = "E=87        ";break;
          case 88:men = "E=88        ";break;
          case 89:men = "E=89        ";break;
          case 90:men = "E=90        ";break;
          case 91:men = "E=91        ";break;
          case 92:men = "E=92        ";break;
          case 93:men = "E=93        ";break;
          case 94:men = "E=94        ";break;
          case 95:men = "E=95        ";break;
          case 96:men = "E=96        ";break;
          case 97:men = "E=97        ";break;
          case 98:men = "E=98        ";break;
          case 99:men = "E=99        ";break;
          case 100:men = "E=100        ";break;
          case 101:men = "E=101        ";break;
          case 102:men = "E=102        ";break;
          case 103:men = "E=103        ";break;
          case 104:men = "E=104        ";break;
          case 105:men = "E=105        ";break;
          case 106:men = "E=106        ";break;
          case 107:men = "E=107        ";break;
          case 108:men = "E=108        ";break;
          case 109:men = "E=109        ";break;
          case 110:men = "E=110        ";break;
          case 111:men = "E=111        ";break;
          case 112:men = "E=112        ";break;
          case 113:men = "E=113        ";break;
          case 114:men = "E=114        ";break;
          case 115:men = "E=115        ";break;
          case 116:men = "E=116        ";break;
          case 117:men = "E=117        ";break;
          case 118:men = "E=118        ";break;
          case 119:men = "E=119        ";break;
          case 120:men = "E=120        ";break;
          case 121:men = "E=121        ";break;
          case 122:men = "E=122        ";break;
          case 123:men = "E=123        ";break;
          case 124:men = "E=124        ";break;
          case 125:men = "E=125        ";break;
          case 126:men = "E=126        ";break;
          case 127:men = "E=127        ";break;
          case 128:men = "E=128        ";break;
          case 129:men = "E=129        ";break;
          case 130:men = "E=130        ";break;
          case 131:men = "E=131        ";break;
          case 132:men = "E=132        ";break;
          case 133:men = "E=133        ";break;
          case 134:men = "E=134        ";break;
          case 135:men = "E=135        ";break;
          case 136:men = "E=136        ";break;
          case 137:men = "E=137        ";break;
          case 138:men = "E=138        ";break;
          case 139:men = "E=139        ";break;
          case 140:men = "E=140        ";break;
          case 141:men = "E=141        ";break;
          case 142:men = "E=142        ";break;
          case 143:men = "E=143        ";break;
          case 144:men = "E=144        ";break;
          case 145:men = "E=145        ";break;
          case 146:men = "E=146        ";break;
          case 147:men = "E=147        ";break;
          case 148:men = "E=148        ";break;
          case 149:men = "E=149        ";break;
          case 150:men = "E=150        ";break;
          case 151:men = "E=151        ";break;
          case 152:men = "E=152        ";break;
          case 153:men = "E=153        ";break;
          case 154:men = "E=154        ";break;
          case 155:men = "E=155        ";break;
          case 156:men = "E=156        ";break;
          case 157:men = "E=157        ";break;
          case 158:men = "E=158        ";break;
          case 159:men = "E=159        ";break;
          case 160:men = "E=160        ";break;
          case 161:men = "E=161        ";break;
          case 162:men = "E=162        ";break;
          case 163:men = "E=163        ";break;
          case 164:men = "E=164        ";break;
          case 165:men = "E=165        ";break;
          case 166:men = "E=166        ";break;
          case 167:men = "E=167        ";break;
          case 168:men = "E=168        ";break;
          case 169:men = "E=169        ";break;
          case 170:men = "E=170        ";break;
          case 171:men = "E=171        ";break;
          case 172:men = "E=172        ";break;
          case 173:men = "E=173        ";break;
          case 174:men = "E=174        ";break;
          case 175:men = "E=175        ";break;
          case 176:men = "E=176        ";break;
          case 177:men = "E=177        ";break;
          case 178:men = "E=178        ";break;
          case 179:men = "E=179        ";break;
          case 180:men = "E=180        ";break;
          case 181:men = "E=181        ";break;
          case 182:men = "E=182        ";break;
          case 183:men = "E=183        ";break;
          case 184:men = "E=184        ";break;
          case 185:men = "E=185        ";break;
          case 186:men = "E=186        ";break;
          case 187:men = "E=187        ";break;
          case 188:men = "E=188        ";break;
          case 189:men = "E=189        ";break;
          case 190:men = "E=190        ";break;
          case 191:men = "E=191        ";break;
          case 192:men = "E=192        ";break;
          case 193:men = "E=193        ";break;
          case 194:men = "E=194        ";break;
          case 195:men = "E=195        ";break;
          case 196:men = "E=196        ";break;
          case 197:men = "E=197        ";break;
          case 198:men = "E=198        ";break;
          case 199:men = "E=199        ";break;
          case 200:men = "E=200        ";break;
          case 201:men = "E=201       ";break;
          case 202:men = "E=202       ";break;
          case 203:men = "E=203       ";break;
          case 204:men = "E=204       ";break;
          case 205:men = "E=205       ";break;
          case 206:men = "E=206       ";break;
          case 207:men = "E=207       ";break;
          case 208:men = "E=208       ";break;
          case 209:men = "E=209       ";break;
          case 210:men = "E=210       ";break;
          case 211:men = "E=211       ";break;
          case 212:men = "E=212        ";break;
          case 213:men = "E=213        ";break;
          case 214:men = "E=214        ";break;
          case 215:men = "E=215        ";break;
          case 216:men = "E=216        ";break;
          case 217:men = "E=217        ";break;
          case 218:men = "E=218        ";break;
          case 219:men = "E=219        ";break;
          case 220:men = "E=220        ";break;
          case 221:men = "E=221        ";break;
          case 222:men = "E=222        ";break;
          case 223:men = "E=223        ";break;
          case 224:men = "E=224        ";break;
          case 225:men = "E=225        ";break;
          case 226:men = "E=226        ";break;
          case 227:men = "E=227        ";break;
          case 228:men = "E=228        ";break;
          case 229:men = "E=229        ";break;
          case 230:men = "E=230        ";break;
          case 231:men = "E=231        ";break;
          case 232:men = "E=232        ";break;
          case 233:men = "E=233        ";break;
          case 234:men = "E=234        ";break;
          case 235:men = "E=235        ";break;
          case 236:men = "E=236        ";break;
          case 237:men = "E=237        ";break;
          case 238:men = "E=238        ";break;
          case 239:men = "E=239        ";break;
          case 240:men = "E=240        ";break;
          case 241:men = "E=241        ";break;
          case 242:men = "E=242        ";break;
          case 243:men = "E=243        ";break;
          case 244:men = "E=244        ";break;
          case 245:men = "E=245        ";break;
          case 246:men = "E=246        ";break;
          case 247:men = "E=247        ";break;
          case 248:men = "E=248        ";break;
          case 249:men = "E=249        ";break;
          case 250:men = "E=250       ";break;
          case 251:men = "E=251       ";break;
          case 252:men = "E=252       ";break;
          case 253:men = "E=253       ";break;
          case 254:men = "E=254       ";break;
          case 255:men = "E=255       ";break;
          case 256:men = "E=256       ";break;
          case 257:men = "E=257       ";break;
          case 258:men = "E=258       ";break;
          case 259:men = "E=259       ";break;
          case 260:men = "E=260        ";break;
          case 261:men = "E=261        ";break;
          case 262:men = "E=262        ";break;
          case 263:men = "E=263        ";break;
          case 264:men = "E=264        ";break;
          case 265:men = "E=265        ";break;
          case 266:men = "E=266        ";break;
          case 267:men = "E=267        ";break;
          case 268:men = "E=268        ";break;
          case 269:men = "E=269        ";break;
          case 270:men = "E=270        ";break;
          case 271:men = "E=271       ";break;
          case 272:men = "E=272       ";break;
          case 273:men = "E=273       ";break;
          case 274:men = "E=274       ";break;
          case 275:men = "E=275       ";break;
          case 276:men = "E=276       ";break;
          case 277:men = "E=277       ";break;
          case 278:men = "E=278       ";break;
          case 279:men = "E=279       ";break;
          case 280:men = "E=280       ";break;
          case 281:men = "E=281       ";break;
          case 282:men = "E=282       ";break;
          case 283:men = "E=283       ";break;
          case 284:men = "E=284       ";break;
          case 285:men = "E=285       ";break;
          case 286:men = "E=286       ";break;
          case 287:men = "E=287       ";break;
          case 288:men = "E=288       ";break;
          case 289:men = "E=289       ";break;
          case 290:men = "E=290       ";break;
          case 291:men = "E=291       ";break;
          case 292:men = "E=292       ";break;
          case 293:men = "E=293       ";break;
          case 294:men = "E=294       ";break;
          case 295:men = "E=295       ";break;
          case 296:men = "E=296       ";break;
          case 297:men = "E=297       ";break;
          case 298:men = "E=298       ";break;
          case 299:men = "E=299       ";break;
          case 300:men = "E=300       ";break;
          case 301:men = "E=301       ";break;
          case 302:men = "E=302       ";break;
          case 303:men = "E=303       ";break;
          case 304:men = "E=304       ";break;
          case 305:men = "E=305       ";break;
          case 306:men = "E=306       ";break;
          case 307:men = "E=307       ";break;
          case 308:men = "E=308       ";break;
          case 309:men = "E=309       ";break;
          case 310:men = "E=310       ";break;
          case 311:men = "E=311       ";break;
          case 312:men = "E=312        ";break;
          case 313:men = "E=313        ";break;
          case 314:men = "E=314        ";break;
          case 315:men = "E=315        ";break;
          case 316:men = "E=316        ";break;
          case 317:men = "E=317        ";break;
          case 318:men = "E=318        ";break;
          case 319:men = "E=319        ";break;
          case 320:men = "E=320        ";break;
          case 321:men = "E=321        ";break;
          case 322:men = "E=322        ";break;
          case 323:men = "E=323        ";break;
          case 324:men = "E=324        ";break;
          case 325:men = "E=325        ";break;
          case 326:men = "E=326        ";break;
          case 327:men = "E=327        ";break;
          case 328:men = "E=328        ";break;
          case 329:men = "E=329        ";break;
          case 330:men = "E=330        ";break;
          case 331:men = "E=331        ";break;
          case 332:men = "E=332        ";break;
          case 333:men = "E=333        ";break;
          case 334:men = "E=334        ";break;
          case 335:men = "E=335        ";break;
          case 336:men = "E=336        ";break;
          case 337:men = "E=337        ";break;
          case 338:men = "E=338        ";break;
          case 339:men = "E=339        ";break;
          case 340:men = "E=340        ";break;
          case 341:men = "E=341        ";break;
          case 342:men = "E=342        ";break;
          case 343:men = "E=343        ";break;
          case 344:men = "E=344        ";break;
          case 345:men = "E=345        ";break;
          case 346:men = "E=346        ";break;
          case 347:men = "E=347        ";break;
          case 348:men = "E=348        ";break;
          case 349:men = "E=349        ";break;
          case 350:men = "E=350       ";break;
          case 351:men = "E=351       ";break;
          case 352:men = "E=352       ";break;
          case 353:men = "E=353       ";break;
          case 354:men = "E=354       ";break;
          case 355:men = "E=355       ";break;
          case 356:men = "E=356       ";break;
          case 357:men = "E=357       ";break;
          case 358:men = "E=358       ";break;
          case 359:men = "E=359       ";break;
          case 360:men = "E=360        ";break;
          case 361:men = "E=361        ";break;
          case 362:men = "E=362        ";break;
          case 363:men = "E=363        ";break;
          case 364:men = "E=364        ";break;
          case 365:men = "E=365        ";break;
          case 366:men = "E=366        ";break;
          case 367:men = "E=367        ";break;
          case 368:men = "E=368        ";break;
          case 369:men = "E=369        ";break;
          case 370:men = "E=370        ";break;
          case 371:men = "E=371       ";break;
          case 372:men = "E=372       ";break;
          case 373:men = "E=373       ";break;
          case 374:men = "E=374       ";break;
          case 375:men = "E=375       ";break;
          case 376:men = "E=376       ";break;
          case 377:men = "E=377       ";break;
          case 378:men = "E=378       ";break;
          case 379:men = "E=379       ";break;
          case 380:men = "E=380       ";break;
          case 381:men = "E=381       ";break;
          case 382:men = "E=382       ";break;
          case 383:men = "E=383       ";break;
          case 384:men = "E=384       ";break;
          case 385:men = "E=385       ";break;
          case 386:men = "E=386       ";break;
          case 387:men = "E=387       ";break;
          case 388:men = "E=388       ";break;
          case 389:men = "E=389       ";break;
          case 390:men = "E=390       ";break;
          case 391:men = "E=391       ";break;
          case 392:men = "E=392       ";break;
          case 393:men = "E=393       ";break;
          case 394:men = "E=394       ";break;
          case 395:men = "E=395       ";break;
          case 396:men = "E=396       ";break;
          case 397:men = "E=397       ";break;
          case 398:men = "E=398       ";break;
          case 399:men = "E=399       ";break;
          case 400:men = "E=400       ";break;
          case 401:men = "E=401       ";break;
          case 402:men = "E=402       ";break;
          case 403:men = "E=403       ";break;
          case 404:men = "E=404       ";break;
          case 405:men = "E=405       ";break;
          case 406:men = "E=406       ";break;
          case 407:men = "E=407       ";break;
          case 408:men = "E=408       ";break;
          case 409:men = "E=409       ";break;
          case 410:men = "E=410       ";break;
          case 411:men = "E=411       ";break;
          case 412:men = "E=412        ";break;
          case 413:men = "E=413        ";break;
          case 414:men = "E=414        ";break;
          case 415:men = "E=415        ";break;
          case 416:men = "E=416        ";break;
          case 417:men = "E=417        ";break;
          case 418:men = "E=418        ";break;
          case 419:men = "E=419        ";break;
          case 420:men = "E=420        ";break;
          case 421:men = "E=421        ";break;
          case 422:men = "E=422        ";break;
          case 423:men = "E=423        ";break;
          case 424:men = "E=424        ";break;
          case 425:men = "E=425        ";break;
          case 426:men = "E=426        ";break;
          case 427:men = "E=427        ";break;
          case 428:men = "E=428        ";break;
          case 429:men = "E=429        ";break;
          case 430:men = "E=430        ";break;
          case 431:men = "E=431        ";break;
          case 432:men = "E=432        ";break;
          case 433:men = "E=433        ";break;
          case 434:men = "E=434        ";break;
          case 435:men = "E=435        ";break;
          case 436:men = "E=436        ";break;
          case 437:men = "E=437        ";break;
          case 438:men = "E=438        ";break;
          case 439:men = "E=439        ";break;
          case 440:men = "E=440        ";break;
          case 441:men = "E=441        ";break;
          case 442:men = "E=442        ";break;
          case 443:men = "E=443        ";break;
          case 444:men = "E=444        ";break;
          case 445:men = "E=445        ";break;
          case 446:men = "E=446        ";break;
          case 447:men = "E=447        ";break;
          case 448:men = "E=448        ";break;
          case 449:men = "E=449        ";break;
          case 450:men = "E=450       ";break;
          case 451:men = "E=451       ";break;
          case 452:men = "E=452       ";break;
          case 453:men = "E=453       ";break;
          case 454:men = "E=454       ";break;
          case 455:men = "E=455       ";break;
          case 456:men = "E=456       ";break;
          case 457:men = "E=457       ";break;
          case 458:men = "E=458       ";break;
          case 459:men = "E=459       ";break;
          case 460:men = "E=460        ";break;
          case 461:men = "E=461        ";break;
          case 462:men = "E=462        ";break;
          case 463:men = "E=463        ";break;
          case 464:men = "E=464        ";break;
          case 465:men = "E=465        ";break;
          case 466:men = "E=466        ";break;
          case 467:men = "E=467        ";break;
          case 468:men = "E=468        ";break;
          case 469:men = "E=469        ";break;
          case 470:men = "E=470        ";break;
          case 471:men = "E=471       ";break;
          case 472:men = "E=472       ";break;
          case 473:men = "E=473       ";break;
          case 474:men = "E=474       ";break;
          case 475:men = "E=475       ";break;
          case 476:men = "E=476       ";break;
          case 477:men = "E=477       ";break;
          case 478:men = "E=478       ";break;
          case 479:men = "E=479       ";break;
          case 480:men = "E=480       ";break;
          case 481:men = "E=481       ";break;
          case 482:men = "E=482       ";break;
          case 483:men = "E=483       ";break;
          case 484:men = "E=484 Error al declara un puerto       ";break;
          case 485:men = "E=485       ";break;
          case 486:men = "E=486       ";break;
          case 487:men = "E=487       ";break;
          case 488:men = "E=488       ";break;
          case 489:men = "E=489       ";break;
          case 490:men = "E=490       ";break;
          case 491:men = "E=491       ";break;
          case 492:men = "E=492       ";break;
          case 493:men = "E=493       ";break;
          case 494:men = "E=494       ";break;
          case 495:men = "E=495       ";break;
          case 496:men = "E=496       ";break;
          case 497:men = "E=497       ";break;
          case 498:men = "E=498       ";break;
          case 499:men = "E=499       ";break;
          case 500:men = "E=500       ";break;
          default: men ="Algo anda mal , ha ocurrido un error";
        }
        return men;
    }

    public String analizaToken(Symbol curToken){
            int analiza = curToken.sym;
            String msn=" ";
            switch(analiza){

                case 0:msn = "  EOF ";break;
                default: msn= "ERROR TOKEN DESCONOCIDO"; break;



            }

            return msn;
    }




}
