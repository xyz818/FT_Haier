�}  �  #R�Qo �a	��� m#o>�{0&ƴ������Ǟ�ʯ�B�U4�W�^�>��,DA�95��5:�L�중Aϲ��q �3vF�F��,2m��46�8��Rd����S����~�_�[��L��^���׆|$.���r�WjLI���҄�"����@WN�ZX�M�R�c�LV�+V��f&�xӑ4��B2Ҝ�=a���q�Vm�����,���ʰ��\�L�z��E��o�@�֥���¯9��g?���"xM���܉h�^
/��͕�Z�+����F���t	$�=b�W��g	�#ͨ���ؿ�vx�l��dG��^�P�	<D�J��yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�l�+���M�u��K]m}��$)<�Ҩ֦so�C�����@7��7��d 1TFDNE�ј7�KE:��E,U��R˽bX]G���x�GH�<;�LԆ�LDW{PRp�n(�|>⚀�J���p(�d�C�%�y��욮/nm7'��-���nY4ܑM��V;%Qq�!;v���s�"\Q�&�0�~zU�ҷr7���Aa<N������ys��{3.�k�e��`�I�c0����fhXp��v� ҽ��>��\��u=�p���K�N\�Gy[XG�V,E ���D�-p��'}y����D �-�>�Z�����):�~��@A��_���i[~@������?̛�ulzpv��GX#�j��$ٱ3os�~~���1�W�:hz�����P�Ӗ�@u���������efkcc������h���p�,�_)*��YC�����mQa����]�̓=5�����!b�f�u.�m�V�a���y����̚_U9�[��List<>();
        fragments.add(new LoginFragment());
        fragments.add(new EmptyFragment());
        //左右两种登录方式
        FragmentOrderListAdapter adapter = new FragmentOrderListAdapter(this.getSupportFragmentManager(), fragments, new String[]{"账号密码登录", "验证码登录"});
        viewPager.setAdapter(adapter);
        tableLayout.setupWithViewPager(viewPager);
    }
}
