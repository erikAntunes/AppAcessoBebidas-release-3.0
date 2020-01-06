package com.titanz.titanztech.view;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.titanz.titanztech.R;
import com.titanz.titanztech.adapters.ServicosAdapter;
import com.titanz.titanztech.interfaces.ServicosListener;
import com.titanz.titanztech.models.Produtos;
import java.util.ArrayList;



public class FragmentProdutos extends Fragment implements ServicosListener {

    private RecyclerView recyclerViewServicos;
    private ServicosAdapter servicosAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.servicos_fragment,container,false);

        ArrayList<Produtos> produtosArrayList = new ArrayList<>();

        Produtos produtos1 = new Produtos();
        produtos1.setNome("Jack Daniel's");
        produtos1.setImagem("https://lh3.googleusercontent.com/j0j5M8fAe6n5X_EDn2uP13R0MSFUE7W_xEwjBEWsvvt1FqEwDIZ9Om8bgEVS51W3SoHj4PUvldjzNeXGwuRlIcfE0TP3MDjpZ1e7mVwNRGm0_W-6Aav2eT-Mnh3YuUTQVpRHRAK-nHy2up70E4FhcCDW9DJEqk2-fH3crnYqM9pPAw9aZguRNyz2FILVkgrM1PJ3cuT0g7B3D81SzGTN_lUhZdYCYaOQbuenVAYr-EYiAXxy1nsq8xrCPIpJ96tbRGxPrTdGRcCkr5NzMH2Zfjq0dPwzPWeNrdjk9L5ayDyWhDlu-pGP89WxKoN83-1Vad6XoyaY4-ZGIPGnDiLjTGJvf-yp-Zq4lWXj_H41OdGYX0DWFO5SAcbXu3CUod6JUDAOJs5rRNiwJUzEKgyVkWiAvK4iIMNV80pa3DGoS0XqFl6ygpriubGiP5tLKZVqBxSuwBvZrMV_B4iatzp5x9s5eNsHYpr2aDqM6GI5YuIZDEaMb7ZGwaafa5A3gOOyJ5TDtMH-1jnyVVxdxeBIrFU2KILAnX4tLulYIG4M7igIP57qs4CgpyZDYapSNbvszwzKQH4qEPlOz1EZFovd6jf-4ZKxiZwDQgylYQr8Y74hGNnMX3Fdl5c9dHtFYEUw0MLGBfGPsZORBuPc5-KF78pw9F35NPSY-4XvP5IUftKX_z8Aerug_oPpyz1B32LXW4qczoctjhju7s-IsSt7DnwNsvD_ZLd2cYhAAhilOQG7-4DD=s800-no");
        produtos1.setDescricao("A Titanz Tech, oferece um serviço único na Região Sul de São Paulo. Com desenvolvimento de Aplicativos Android Mobile, focados em Comercios, Vendas Digitais e Delivery, cobrando um preço justo e acessível para os empreendedores da Era Digital.");
        produtos1.setId("1 L");
        produtosArrayList.add(produtos1);
        Produtos produtos2 = new Produtos();
        produtos2.setNome("Red Label");
        produtos2.setImagem("https://lh3.googleusercontent.com/DItwQWqkiYFPoPGtDrTR9SEQSf84U1G3DkhQlwXGKwZYMBMtTr_xSHr1SuqV12dIp5GYVgXFuSha8ZrWtZsmzXJsKs2ojJNJP0pIzi5KjpWMzi0dYHU_gTAPwzY1FkvaKCWCEi-EyDxnwtT4JtYnQUO9DSFrsrrAtzT3Kl_uSjmp8ChB-svt76eXnhedi4bD6LtXPEzpLpI1m8jQK1SmjIJ1pi9QghqEQb10ALM38UPIq_CGB5SxH2MDLlas7YgFHNP9xOaEL_iiEOXme5b6dr7eofs8WMq2LL2UVEku4groJ3cygM5N6M8OUSCa4gr0Z9eoTQAY-qRmAza66MrY_CreCT0pj0SibmqEQ_t8V85ylwvpdMlFCpO98GkavK3k90_de2FBsr4MpTFsXeuIbvZDk5hedeep3OVXyCjkPlLWpMVMRrjoZeNZ9uRWxF-pDg4v_H_MPSq1u9vekA3fJTUJh1-s7OO3PMN54vZr9qx7MAd6Km8YBPO2RDqmPk83JMfzVVeZ3yofR6AKbbGHeB6Fq4PEyfF1xl8u7MxpYeWQ1jSD_8pC6rNIwikCRBr1r_H9nUzZ3kh7R83S8jKrl_xtCFtZHXzEhmkuuAWjRnFzCc1q0KmpmM4zu5OvjiEsNhYMEfTXpov1bwIQT_UuSFJe6IyYcKRS1uILkKB11QDT2zuqWZKlUz-OOHMQFMc8ErHnd1kWKJ9ZP_FzddZ-fqC_AsiYxeBG1BgXUdwuV-5GB487=s800-no");
        produtos2.setDescricao("Nosso serviço de Formatação de Notebooks consiste em, executar um Backup completo dos arquivos pessoais do cliente, Formatar e apagar todos os dados do HD onde o Sistema Operacional está instalado, e Reexecutar a instalação do Zero do Windows 7, 8.1 ou 10. Após a formatação, instalamos todos os drivers refêrentes a placa mãe do Notebook, recolocamos os arquivos pessoais do cliente e instalamos os programas básicos, Antivirus, Office, Leitor de Video e PDF.");
        produtos2.setId("1 L");
        produtosArrayList.add(produtos2);
        Produtos produtos3 = new Produtos();
        produtos3.setNome("Ballantine's");
        produtos3.setImagem("https://lh3.googleusercontent.com/XpzZOgjZqnOod8_V3JToR861ZT2jXEa6Er6n0-wTkETCHvJQtBUGW0y8ZNbf85tAMKTjQmlE4NDpkQVVE297SAqsHd50c2y7WvO2WnoQ5-iZ55BCBaQRfcSIWmpU7gqqpGLInCSR2G48nF_uKnLEfyQwCleujkW5HhQDXOVCiIbvXpDWcMfjORxtt3ZqmOGyh1eQtr0FAWuAeNJE-OsfgEOSCmLsBYozpvVbwD3yVKBdALQOhgEUIUPPDdgQudHSaSxTe62tttKumYps-glD7mRLgjCrkWaPAyJpMtCGDWt3tRfTsi8BpYzkeTu6kGV_O0h5gKV4dwK1gJy44yDb1oCAvMdc-2PpKVqHmhxEgHNIOq7qKtEPG9svT9g-RYXeVXr_YSaPyO8ZgWqYEsOLZknEwUwTNaOijoozfi6-JrELsBMGtJ4pow26DFzuy3f2qvcgbDXJUWa1UBWL0yueg4mxE8c96lVs_9eGd3N1dnmaT6RmfUQOjk79ORT8IoG03l9A7t5V2tdhaM59OuvGWHc9IQtgDXTy7HW_JGsddftLWBK9k6IbdLt0mEAV1-aJjMA_rXeB_xShE9uWhvbJaTKSwThgb1cGl-0mThpVwaD27JMFrKLVAL9eFRzMmAi7012i9wrs5yrK1zjUmwUhFy5Ic2Qb-EhBaoQ_2cd59_ONyG-g7SyNT8EhO9yW1xaggsszQiANCt9JdElfiWuLBPdK-wKZRPcWPeq9OIMuKZT9VCr8=s800-no");
        produtos3.setDescricao("Nosso serviço de Formatação de Desktop consiste em, executar um Backup completo dos arquivos pessoais do cliente, Formatar e apagar todos os dados do HD onde o Sistema Operacional está instalado, e Reexecutar a instalação do Zero do Windows 7, 8.1 ou 10. Após a formatação, instalamos todos os drivers refêrentes a placa mãe do Desktop, recolocamos os arquivos pessoais do cliente e instalamos os programas básicos, Antivirus, Office, Leitor de Video e PDF.");
        produtos3.setId("1 L");
        produtosArrayList.add(produtos3);
        Produtos produtos4 = new Produtos();
        produtos4.setNome("White Horse");
        produtos4.setImagem("https://lh3.googleusercontent.com/TBPiWsphWBOYpi5Uj1GOXkdEjgyLqnS6CevtLvl_HBJj68YUCWBb7nSelkmumqEjB4CxCpKWW5Bn7VztfKwR5Zzl5R4DS-MHXa2hb95u2paNdyMFhUDi4VNpbIH6VJvnk7zJhLUTSjroEpB5kUrfa7KHNZqGCmMpWCQIF5HQIHoOv6KXTqPUdotuscYMb7Y81fsIJSwG5R5XZmS98kqCAMmeRMK8p4mzrm403H1Qfz5R7Hnh9YG41MSjVTVoLP_n8FFOTL9PIgaEeegQJJFPBS0uFMM3mtMWoxVrmgZR3N_G-6gkTtPFZu1n1CM2tRqxtHfY4PkGDyG4fM9yIXkvzcc-Af7zUKxXPquxaMlbIUuV7MidL8Qnrc_FDq-TQSlCLDD3def314m1jCrUnLQqf9SRvuR7yDLc5CtYAMbyqRSaMjG-tdHwYIQ6iVUVp0xwRh2SvXLoyYnpQonauvSz9MCnTn1L0xBtnT_FF40dzelrxVGV_pZ0oDgQQvs1XG5xLLRQF7lbL0YKhjEOixd7kroAH0Io7hR2NczYZ9bFhw6ZTEabOiPIKuum4qaDz0nRx2odK-WT7YaOYrbZKKBN5tmY_al8DxRyjBbffc5uL7TwufuJBc8sL_R-gWqlLCc7ccEuXGf9FHe4yGF8ab4k7O-u5kM2GOvswzapu45n7FlE0VB4qrx_vqg2STJCL0Sety6n5y7pXS6FoPT5Y2qoIFWaTf2HvDYLaqKedZgU19UvRnWK=s800-no");
        produtos4.setDescricao("Em nossos Backups, recuperamos os arquivos pessoais de Notebooks, Desktops e Dispositivos Móveis dos clientes. Salvando Fotos, Videos e Arquivos Administrativos em algum HD externo, Pen Drive ou Dispositivo de Armazenamento da escolha do cliente.");
        produtos4.setId("1 L");
        produtosArrayList.add(produtos4);
        Produtos produtos5 = new Produtos();
        produtos5.setNome("Smirnoff");
        produtos5.setImagem("https://lh3.googleusercontent.com/IV9J4cs3zLnzPGIvTGeEGuvPxx__s5b6MnbWH7PLImVKOrdOcWobqKuy_64Wz2ndhBuR2AYpNgxJpGrS463ohyDMtzU5x_RHxvHqC58RAJ1jzaaqbi2zjPKkdi0XF5WUBrWNj9CyFSaZhK4wAs5UyVLTGLQbS191qgggFDtVaiQPbGz95x4bHLS7vUyBLOV5nFidmgIHCpqCuuQrJxwkgPYVVmBQb3l3b-zM8kppGTchYdudbYrxWiOIYNs4iKcp5UiwlJFwDbqvapJ2C0UbXlQM2aCvC9WF5KecC9e10qlRKItXm6QL7tDaJFvbT6cLo-4_G1x6JhxEJY_MNFPDipvHd-K64EuZCd5oaD6H6K5KPi3jK-qFwzIgCsYHxB6iaSua9fU1feWPLoLKSIc2YrkiIDgofMlb3vHpvAbCuucdQxa240pP-hOfO-r-uA1Ty-jFXrTa0YcBw6ABix4kaPwzpdAAXQmAJNtOQi54INvdwXGUJaB3sRblJPfjjslBT4dLPrVM0hsdpx4biUlAN1YaFoivfjK831YpYRZV986kow0F_mpcmIB021g5tz4BWKMyjmpe8i-0PKRRNciqeMJYUCKqhwOGzbqwHkZxnna6nPLXjYpt2gufT8tLlTOk3WuUIA90Y8A9SWR6_xzeAC4HF3_l-H1IDREvNd6OryUd-beAyzCO_a7AUIMmg41QYbQpvdluNCeb0GxC4QxQrFC0kH2JkmOixS5URNORKbt6lUOj=s800-no");
        produtos5.setDescricao("Quando os teclados de Notebook começam a apresentar falhas multiplas, uma simples limpeza acaba nao sendo o sucifiente para faze-lo voltar a funcionar corretamente, então nós encomendamos uma peça nova, e substituimos o teclado velho e aváriado.");
        produtos5.setId("998ml");
        produtosArrayList.add(produtos5);
        Produtos produtos6 = new Produtos();
        produtos6.setNome("Red Bull");
        produtos6.setImagem("https://lh3.googleusercontent.com/CctkWQbiTQlcANglvfnP-O2F5jQnCfDTIlIuRsOmyjA7pf8sNt4ykpD3mOW0NZ4kVH7qyzW6tRZdNWyycejpKFYsUJNHfFPFlSzmCszKqqxpMf2NZvpAv34w0RId84kYr9FRixiOYGErGq5pV38BtJSUcrI-ibeIqf2A31-QPR_YV-gdVhaHrztq6mLCxQ-Jqobf1hE2UjDHyV3vHeZyJnch2XQEPw9I21icpwt1rkd9IM3CelUmKD8Iv_jbFkzeiEuMcjVZe4zjzTrzDKhIzCnJWYRoZsUodEozPPpOZtSeTWOOny4TKPen0dfxiLkchn92bP2rKAotqPG_GndFCy8BBaCsMPnI68eryOO3iG2UblxlFkdO1tI2pQM1UDwCORuUDIPg_Ts5KCjqBzc7g9dmNosofVmtPrezmL6yLfCI_Oqu-G7TUw1lr0U6AkfHQL_M5QYX5g1O-meIEx0jviibHLuhMq4eq8LyqztnQSh4O0arYBnb4XV0egix7S3zXKYtd83Vzu3rb8stwUile-m1Ebb8JMMfl9BOaHl3heJvfXuTJHh-ETollAnrvpKbo1RGeg6zK2mD5MY0qZDAX_AUzyadWNXSdSQkSaLLUXEXovaak0UVwe_0WkzkOifvfbMsNKzfXpTAJ2wEUtvXT8d-BRKgJcte2UT2q2sgLtrXL9CPKuzd8J5gDmxY9HfkntDBvPGqr2ED-YvX7a-cgTkHU9amxcUolFV0LJ6zZm5FGs0C=s800-no");
        produtos6.setDescricao("Os HDs geralmente são as peças mais fragéis de um computador, qualquer tipo de queda, ou pancada pode danificar sua agulho, gerando lentidão, travamentos ou perda total da peça, então nos casos de HD com avaria, nós encomendamos uma peça nova, fazemos a substituíção e instalação do sistema operacional na máquina.");
        produtos6.setId("500ml");
        produtosArrayList.add(produtos6);
        Produtos produtos7 = new Produtos();
        produtos7.setNome("Bonafont");
        produtos7.setImagem("https://lh3.googleusercontent.com/C6sBy3e64j4pwJZRyND4o3S_PYbPirCpRnbKgREgHeMdEyrGUZ8bEy0-4bOXg6GN3PqfepRJtCLfWkvIh27N1KDjip-Cefpy_gyIv60GkvFirq6e2E9bOaC2croMGkAfhdBE2YPQHPA2GFtQcGSvhJXBMDA3QDaAY9Xx8gzIOyKQuMy4eb5H6x65zz7rFybqgMKFLSZSnpbk_TxLMBxYyNqfoXOvfKmMffoI4AfvET7bIudgF98REVv64Jil_rPbg9vmV49orKMWGTSF1iGmvo3jQShbHYPD6uA9Tusc8BMYfJ8T1Np-zfZPF8S8-hrb-0ATaSyIBbDCiZd_A4GaNZC1dxrEeY_BKV_d1LLUgPTR5aj1mMDVDlrZbXGHAT4VlMXS1I0jnTsAaftDZMAyWUs_KbTAyGOWyVKYnmPB-bFhzdVtdqX7vOoayyT0i908okN79Qu14c6a81oovIg5OD-Y0hY5YTZkEa6fixL4NeeIKUdoJcvViXww_Lo1WAJya9YRbKKI5W-RfdBT9evufqldTYqkAWo6pcLsJ_vrAdkgTkTDgUvjXlLBgvpVep6YLCwx4lV7iyWcBRxcRRhpmJw_NqtUl5FNIxab8VOMbO896TVI2ranOVWvYK5t-Ew8uMlqJbKDKV4waMn9cynnGTj1ebdk3M0isWJgdmkw1agxjuskaXnd_VGegmTkYrEZ8Uz3cvz1zSkYGrMWfMGD5Z4TCVUPKIcvGQVHp0z-7mP6_QzW=s800-no");
        produtos7.setDescricao("Oferecemos um serviço de acessória e compra de peças de computadores de alta performance, conforme o perfil e necessidade do cliente, partimos desde um Upgrade em alguma platarforma antiga, até a montagem do zero, peça por peça, de um computador novo com grande poder de fogo.");
        produtos7.setId("500ml");
        produtosArrayList.add(produtos7);
        Produtos produtos8 = new Produtos();
        produtos8.setNome("Vibe");
        produtos8.setImagem("https://lh3.googleusercontent.com/P2yjjLwoCe5ig_wLIoTWIoNt9Hyt-uLxQ699d4lMY_xdWzztFBkxgYA_u_AtQ1IQXnYcmk3gdKrfs5012gCSl8GEAvRzRPSXvQlSSd492k1-x5aaOBYCSvVCMjxj4kiKQ5Fd50qqNnc2iS3m3PsxAXzp1FkMoZ_yt2J0Ixell3q21v64GHMNqD0_5QQkzzENFLxE-RsiaGE4CSyzAEjbR85EZYRDle83SbWh9GXK7E-7fq0keVljAIVEhYeCEiu2jDgGPE-N8WZLE3dRQkU6CpMCDcWJ3fAApX-ln77lyIynii7SP4lnxWZcSQHAXczpPGrsepcAxB5SjgBFSS-3VYxnEUO9sghGg0OW-b6ISozgSRfzdk43JmNGn6IAuS1u6Vv4_si_j15XBMZ1c3jPlq75kY9LIUajv1OXdOF6SBpmXukb4mN7-0lAlwPTzgxWTrNBdKrKcuKy2ke_il2tAVMT60Nv-J6JItyhU5TxHaDe-Vqx03b_ZVQ-KlS5IC3gRTtWGyFsFHPcTu5OjkzrlsGoTgiUIYSKk2cmNeGIwFAK65xb3KTP0upEa4VpCSOYFJZ5y_G48vlDlILsTA0euy6O4eLEI9BUl6KfNQ44PxQbSbj_e1xEZ9iQi6hR0M7URRwOTtzR5z2IfIJLZKW3IZHaI_v5-tu6MtC8Ub7Q3Cx-RVjtrPPNeSPu3bzw1_r36fD9hGqxCamJG5cqwaKetoQyi-XNrJLQA5cHzYiD8kIjNfl0=s800-no");
        produtos8.setDescricao("O componente mais simples de se substituir em uma máquina é a memória RAM, e hoje em dia com os softwares consumindo cada vez mais recursos para rodar, uma máquina com 2GB de RAM pode ser considerada muito ultrapassada, então sempre mantemos em estoque memórias DDR2, DDR3 e DDR4 para dar Upgrade nas máquinas dos nossos clientes");
        produtos8.setId("2 L");
        produtosArrayList.add(produtos8);
        Produtos produtos9 = new Produtos();
        produtos9.setNome("Gelo de Côco");
        produtos9.setDescricao("O HD é responsavel por armazenar e rodar o Sistema Operacional do computador, e por ser um componente desenvolvido há duas decádas ele acaba sendo um dos principais vilões das novas plataformas com processadores de alto desempenho, justamente por estar defazado. Nós substituímos os HDs padrões por SSDs, que utilizam memórias flash de alta taxa de leitura e escrita, multiplicando o ganho de velocidade em até 10X");
        produtos9.setImagem("https://lh3.googleusercontent.com/3YZb74LnL0xLIKCe5OT2Um-rS4zEaI_bIv18S3wNrJFGUrdN-jHMLUTEJB0C0HE7lkZmGWgbiIoyOGgi_mA2JldCVOY2sQUYMGgVsUAcmbNCALg2rIYw05NP4yqsIYzSTdGw3ueLAjOGPdbqkdUxI7VcgAKcA1B2xcbYZo4RVSvsx93Vg26x9snrBTsRjtr1_T1ZSBmrsNhmGhlfRcjZ7Lvu5DdaZPEiW21hLWb2DNJbnOquViK0VhLSdru1pOF4e529i8MM4vR9m1JqTaJAytJMiAOZYT-yKa5WKjdikhbVnx66kXIL697YKATgLGHsH85UcBswLAu6mG5PWeMeNxCxgePdceHghLpaw7EOGMbrA9u4tKuyyFphfVXmScpI7fj6yA_kLu2V7N9fIQUA6zbKZHFqAZmIH8T7AJ3N85FclR3efHfOUlqqM90WTxDY4pooyBLz6XB12NeYi3Ry7MN-6UiQ2ygEOO4v9kijXGjjOvyekj7ngX21tn3nSUbRroCQ91cPxcwKqKlS68FVMMILsDcAg0BPtuhhQ6CRJAJ-9MTwtWShK2xgL-OJswGoBXAcLUQHiWA4JE8FDyoXtnnvjox6DP3vCki8d_TFCK4yaAaJaNaOA3wAM7HAAd5R7ROcYpdzNUCuuUxoX5bh32T1UfRRGDiZ2nAFX35aD85e-5fDszKnJmOOtpfSu4ZqsVZ4wCgvEJ6L4MwywLWpoH2PC3oVa9Zb-1Ff9nWeZu3zIaG1=s800-no");
        produtos9.setId("4un");
        produtosArrayList.add(produtos9);


        recyclerViewServicos = view.findViewById(R.id.servicos_recyclerView_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        servicosAdapter = new ServicosAdapter(produtosArrayList,this);

        recyclerViewServicos.setAdapter(servicosAdapter);
        recyclerViewServicos.setLayoutManager(layoutManager);

        return view;
    }

    public void onServicoClicado(Produtos servico) {

        Intent intent = new Intent(getContext(), DetalhesServicosActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("SERVICOS", servico);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}