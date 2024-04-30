package com.kruptokurs.kruptokurs.controllers;

import com.kruptokurs.kruptokurs.models.*;
import com.kruptokurs.kruptokurs.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @Autowired
    private KursRepository kursRepository;

    @GetMapping("/")
    public String kursmain(Model model){
        Iterable<Kurs> kurses = kursRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О нас");
        return "about";
    }

    @Autowired
    private BitcoinRepository bitcoinRepository;

    @GetMapping("/1")
    public String kursdetailsbtc(Model model) {
        Iterable<Bitcoin> kurses = bitcoinRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private EthereumRepository ethereumRepository;

    @GetMapping("/2")
    public String kursdetailseth(Model model) {
        Iterable<Ethereum> kurses = ethereumRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private DogecoinRepository dogecoinRepository;

    @GetMapping("/3")
    public String kursdetailsdog(Model model) {
        Iterable<Dogecoin> kurses = dogecoinRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private SolanaRepository solanaRepository;

    @GetMapping("/4")
    public String kursdetailssol(Model model) {
        Iterable<Solana> kurses = solanaRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private EthenaRepository ethenaRepository;

    @GetMapping("/5")
    public String kursdetailsethena(Model model) {
        Iterable<Ethena> kurses = ethenaRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private OrdinalsRepository ordinalsRepository;

    @GetMapping("/6")
    public String kursdetailsord(Model model) {
        Iterable<Ordinals> kurses = ordinalsRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private LitecoinRepository litecoinRepository;

    @GetMapping("/7")
    public String kursdetailsltc(Model model) {
        Iterable<Litecoin> kurses = litecoinRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private XRPRepository xrpRepository;

    @GetMapping("/8")
    public String kursdetailsxrp(Model model) {
        Iterable<XRP> kurses = xrpRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private ShibainuRepository shibainuRepository;

    @GetMapping("/9")
    public String kursdetailsshi(Model model) {
        Iterable<Shibainu> kurses = shibainuRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private BitcoincashRepository bitcoincashRepository;

    @GetMapping("/10")
    public String kursdetailsbtcc(Model model) {
        Iterable<Bitcoincash> kurses = bitcoincashRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private DogwifhatRepository dogwifhatRepository;

    @GetMapping("/11")
    public String kursdetailsdogw(Model model) {
        Iterable<Dogwifhat> kurses = dogwifhatRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private BinancecoinRepository binancecoinRepository;

    @GetMapping("/12")
    public String kursdetailsbic(Model model) {
        Iterable<Binancecoin> kurses = binancecoinRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private WormholeRepository wormholeRepository;

    @GetMapping("/13")
    public String kursdetailswrh(Model model) {
        Iterable<Wormhole> kurses = wormholeRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private BookofmemeRepository bookofmemeRepository;

    @GetMapping("/14")
    public String kursdetailsboo(Model model) {
        Iterable<Bookofmeme> kurses = bookofmemeRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private CKBRepository ckbRepository;

    @GetMapping("/15")
    public String kursdetailsckb(Model model) {
        Iterable<CKB> kurses = ckbRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private PEPERepository pepeRepository;

    @GetMapping("/16")
    public String kursdetailspepe(Model model) {
        Iterable<PEPE> kurses = pepeRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private AvalancheRepository avalancheRepository;

    @GetMapping("/17")
    public String kursdetailsava(Model model) {
        Iterable<Avalanche> kurses = avalancheRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

    @Autowired
    private YieldguildgamesRepository yieldguildgamesRepository;

    @GetMapping("/18")
    public String kursdetailsygg(Model model) {
        Iterable<Yieldguildgames> kurses = yieldguildgamesRepository.findAll();
        model.addAttribute("kurses", kurses);
        return "kursdetails";
    }

}